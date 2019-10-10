package com.wjk.hibernatedemo.dao;

import com.wjk.hibernatedemo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jikangwang
 */
@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {

}

