package com.wjk.hibernatedemo.service;

import com.wjk.hibernatedemo.dao.CourseDao;
import com.wjk.hibernatedemo.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

/**
 * @author jikangwang
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseDao courseDao;
    @Override
    public List<Course> getAllCourses() {
         return courseDao.findAll();
    }

    @Override
    public void addCourse(Course course) {
        courseDao.save(course);
    }

    @Override
    public Set<Course> getCoursesByStudentName(String name) {
        return courseDao.findCoursesByStudentName(name);
    }

    @Override
    public Course findCourseById(Long id) {
        return courseDao.findCourse(id);
        //return courseDao.findCourseById(id);
    }
}
