package com.example.hibernatedemo;

import com.example.hibernatedemo.service.StudentServiceImpl;
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
public class testStudent {
    @Autowired
    StudentServiceImpl studentServiceImpl;

    @Test
    public void getAllStudent(){
        studentServiceImpl.getAll().forEach(System.out::println);
    }
}
