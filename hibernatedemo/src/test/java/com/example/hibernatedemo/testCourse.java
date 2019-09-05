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
        try {
            courseService.addCourse(new Course(null));
        } catch (Exception e){
            System.out.println("");
            //e.printStackTrace();
        }
    }

    @Test
    public void getAllCourses(){
        courseService.getAllCourses().forEach(System.out::println);
    }
    
    @Test
    public void getCourseById(){
        System.out.println(courseService.findCourseById(7).getName());
    }
}
