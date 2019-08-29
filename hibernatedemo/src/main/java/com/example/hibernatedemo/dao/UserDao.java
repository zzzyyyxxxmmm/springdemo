package com.example.hibernatedemo.dao;

import com.example.hibernatedemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author jikangwang
 */
@Repository
public interface UserDao extends JpaRepository<Student, Integer> {

    @Modifying
    @Query("delete from Student where id=:id")
    public void deleteStudentById(@Param(value = "id") Integer id);
}
