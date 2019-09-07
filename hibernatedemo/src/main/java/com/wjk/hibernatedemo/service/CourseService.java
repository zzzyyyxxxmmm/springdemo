package com.wjk.hibernatedemo.service;

import com.wjk.hibernatedemo.entity.Course;

import java.util.List;
import java.util.Set;

/**
 * @author jikangwang
 */
public interface CourseService {
    List<Course> getAllCourses();
    void addCourse(Course course);
    Set<Course> getCoursesByStudentName(String name);
    Course findCourseById(Long id);
}
