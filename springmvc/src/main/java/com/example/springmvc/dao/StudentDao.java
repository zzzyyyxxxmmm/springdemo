package com.example.springmvc.dao;

import com.example.springmvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jikangwang
 */
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

    Student findStudentById(long id);
}
