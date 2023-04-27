package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.repository.InstructorRepository;

import java.util.List;

public class InstructorRepositoryImpl implements InstructorRepository {

    private final EntityManager entityManager = HibernateConfig.getEntityManager();


    @Override
    public String saveInstructor(Instructor instructor) {
        return null;
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return null;
    }

    @Override
    public Instructor updateInstructor(Long id, Instructor instructor) {
        return null;
    }

    @Override
    public List<Instructor> getInstructorsByCourseId(Long courseId) {
        entityManager.getTransaction().begin();
        List<Instructor> instructors = entityManager.createQuery(
                        "select i from Instructor i " +
                                "join i.courses c where c.id = :courseId", Instructor.class)
                .setParameter("courseId", courseId).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return instructors;
    }


    @Override
    public void deleteInstructorById(Long id) {
        entityManager.getTransaction().begin();
        Instructor instructor = entityManager.find(Instructor.class, id);
        for (int i = 0; i < instructor.getCourses().size(); i++) {
            if (instructor.getCourses().get(i).getInstructors().contains(instructor)) {
                instructor.getCourses().get(i).getInstructors().remove(instructor);
            }
        }

        entityManager.remove(instructor);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public String assignInstructorToCourse(Long instructorId, Long courseId) {
        entityManager.getTransaction().begin();
        Instructor instructor = entityManager.find(Instructor.class, instructorId);
        Course course = entityManager.find(Course.class, courseId);
        instructor.getCourses().add(course);
        course.getInstructors().add(instructor);
        entityManager.getTransaction().commit();
        entityManager.close();
        return instructor.getInstructorName() + " assigned to " + course.getCourseName() + " course!";
    }
}
