package com.example.hibernatedemo;

import com.example.hibernatedemo.entity.Course;
import com.example.hibernatedemo.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jikangwang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testCourse {
    @Autowired
    CourseService courseService;

    @Test
    public void addCourse(){
        courseService.addCourse(new Course("wwwww"));
    }

    @Test
    public void getAllCourses(){
        courseService.getAllCourses().forEach(System.out::println);
    }
    
    @Test
    public void getCourseById(){
        System.out.println(courseService.findCourseById(Long.valueOf(2)).getName());
    }
}
