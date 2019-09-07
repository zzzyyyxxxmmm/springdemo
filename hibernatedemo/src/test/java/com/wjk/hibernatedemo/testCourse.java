package com.wjk.hibernatedemo;

import com.wjk.hibernatedemo.entity.Course;
import com.wjk.hibernatedemo.service.CourseService;
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
        courseService.addCourse(new Course("wwww"));
    }

    @Test
    public void getAllCourses(){
        courseService.getAllCourses().forEach(System.out::println);
    }
    
    @Test
    public void getCourseById(){
        System.out.println(courseService.findCourseById(Long.valueOf(2)));
    }
}
