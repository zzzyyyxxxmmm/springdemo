package com.example.springmvc.service;


import com.example.springmvc.entity.Student;

import java.util.List;

/**
 * @author jikangwang
 */
public interface StudentService {

    void add(Student student);

    void delete(Integer id);

    List<Student> getAll();

    void update(int id, String name);

    void deleteById(int id);

    Student findStudentById(long id);

    void updateStudent(long id, Student student);



}
