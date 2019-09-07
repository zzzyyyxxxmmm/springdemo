package com.wjk.hibernatedemo.service;

import com.wjk.hibernatedemo.entity.Student;

import java.util.List;

/**
 * @author jikangwang
 */
public interface StudentService {

    void add(Student student);

    void delete(Integer id);

    List<Student> getAll();

    void update(int id,String name);

    void deleteById(int id);

    Student findStudentById(Long id);


}
