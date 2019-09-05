package com.example.hibernatedemo;

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
public class testSC {

    @Autowired
    CourseService courseService;
    @Test
    public void getAllCoursesByStudentName(){
        System.out.println("*****"+courseService.getCoursesByStudentName("wang").size());

    }
}
