package com.example.hibernatedemo.dao;

import com.example.hibernatedemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jikangwang
 */
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
