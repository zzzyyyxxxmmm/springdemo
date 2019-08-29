package com.example.hibernatedemo;

import com.example.hibernatedemo.entity.Student;
import com.example.hibernatedemo.service.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernatedemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @Test
    public void addStudent(){
        studentServiceImpl.add(new Student("wang"));
        studentServiceImpl.getAll().forEach(System.out::println);
    }

    @Test
    public void testDelete(){
        studentServiceImpl.deleteById(4);
    }
    @Test
    public void updateStudent(){

    }

}