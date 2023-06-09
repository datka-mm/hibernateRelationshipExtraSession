package org.example.service;

import org.example.entities.Course;

import java.util.List;

public interface CourseService {

    String saveCourse(Course course);

    Course getCourseById(Long id);

    // sort by dateOfStart
    List<Course> getAllCourses();

    String updateCourse(Long id, Course course);

    void deleteCourseById(Long id);

    Course getCourseByName(String name);
}
