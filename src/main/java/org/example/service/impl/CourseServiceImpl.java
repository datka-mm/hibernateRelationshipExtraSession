package org.example.service.impl;

import org.example.entities.Course;
import org.example.repository.CourseRepository;
import org.example.repository.impl.CourseRepositoryImpl;
import org.example.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    CourseRepository repository = new CourseRepositoryImpl();

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
        repository.deleteCourseById(id);
    }

    @Override
    public Course getCourseByName(String name) {
        return null;
    }
}
