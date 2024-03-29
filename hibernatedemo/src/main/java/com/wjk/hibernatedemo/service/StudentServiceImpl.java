package com.wjk.hibernatedemo.service;

import com.wjk.hibernatedemo.dao.StudentDao;
import com.wjk.hibernatedemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author jikangwang
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentDao studentDao;

    @Override
    public void add(Student student) {
        studentDao.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentDao.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.findAll();
    }

    @Override
    public void update(int id, String name) {
    }

    @Override
    public void deleteById(int id) {
    }


    @Override
    public Student findStudentById(Long id) {
        return studentDao.findStudentById(id);
    }
}
