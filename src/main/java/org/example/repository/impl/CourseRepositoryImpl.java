package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entities.Course;
import org.example.repository.CourseRepository;

import java.util.List;

public class CourseRepositoryImpl implements CourseRepository {

    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public String saveCourse(Course course) {
        return null;
    }

    @Override
    public Course getCourseById(Long id) {
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public String updateCourse(Long id, Course course) {
        return null;
    }

    @Override
    public void deleteCourseById(Long id) {
        entityManager.getTransaction().begin();

        // remove 1 version
//        Course course = entityManager.find(Course.class, id);
//        entityManager.remove(course);

        // remove 2 version
        entityManager.remove(entityManager.find(Course.class, id));
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Course with id: " + id + " deleted!");
    }

    @Override
    public Course getCourseByName(String name) {
        return null;
    }
}
