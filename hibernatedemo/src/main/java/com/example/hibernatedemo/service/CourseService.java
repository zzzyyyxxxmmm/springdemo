package com.example.hibernatedemo.service;

import com.example.hibernatedemo.entity.Course;

import java.util.List;
import java.util.Set;

/**
 * @author jikangwang
 */
public interface CourseService {
    List<Course> getAllCourses();
    void addCourse(Course course);
    Set<Course> getCoursesByStudentName(String name);
    Course findCourseById(int id);
}
