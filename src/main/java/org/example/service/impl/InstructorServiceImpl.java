package org.example.service.impl;

import org.example.entities.Instructor;
import org.example.repository.InstructorRepository;
import org.example.repository.impl.InstructorRepositoryImpl;
import org.example.service.InstructorService;

import java.util.List;

public class InstructorServiceImpl implements InstructorService {


    InstructorRepository repository = new InstructorRepositoryImpl();


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
        return repository.getInstructorsByCourseId(courseId);
    }

    @Override
    public void deleteInstructorById(Long id) {
        repository.deleteInstructorById(id);
    }

    @Override
    public String assignInstructorToCourse(Long instructorId, Long courseId) {
        return repository.assignInstructorToCourse(instructorId, courseId);
    }
}
