package org.example;

import org.example.config.HibernateConfig;
import org.example.service.CourseService;
import org.example.service.InstructorService;
import org.example.service.impl.CourseServiceImpl;
import org.example.service.impl.InstructorServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        CourseService courseService = new CourseServiceImpl();
//        courseService.deleteCourseById(3L);

        InstructorService instructorService = new InstructorServiceImpl();
//        System.out.println(instructorService.assignInstructorToCourse(2L, 1L));
//        System.out.println(instructorService.getInstructorsByCourseId(1L));
        instructorService.deleteInstructorById(2L);

    }
}
