package com.wjk.hibernatedemo.dao;

import com.wjk.hibernatedemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author jikangwang
 */
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

    Student findStudentById(Long id);

    //@Query(value = "a.Student from Schedule a where a.score>=:score")
    //List<Student> findStudentWhoseScoreBiggerThan(@Param(value = "score") int score);

    @Query(value = "select * from sc, student where sc.sc_score>=:score and sc.student_id=student.st_id",nativeQuery = true)
    Set<Student> findStudentWhoseScoreBiggerThan(@Param(value = "score") int score);


    @Query(value = "select count(*) from sc, student where sc.sc_score>=:score and sc.student_id=student.st_id",nativeQuery = true)
    int findStudentByCount(@Param(value = "score") int score);
}
