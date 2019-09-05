package com.example.springmvc.dao;

import com.example.springmvc.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author jikangwang
 */
@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {

    @Query(nativeQuery = true, value="select course.* from sc, student, course where sc.student_id=student.id and sc.course_id=course.id and student.name=:name")
    Set<Course> findCoursesByStudentName(@Param(value = "name") String name);

    Course findCourseById(int id);

}

