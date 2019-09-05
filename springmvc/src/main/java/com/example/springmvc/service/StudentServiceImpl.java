package com.example.springmvc.service;

import com.example.springmvc.dao.StudentDao;
import com.example.springmvc.entity.Student;
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
    public Student findStudentById(long id) {
        return studentDao.findStudentById(id);
    }

    @Override
    public void updateStudent(long id ,Student student) {
        Student s=studentDao.findStudentById(id);
        s.setAddress(student.getAddress());
        s.setName(student.getName());
        studentDao.saveAndFlush(s);
    }
}
