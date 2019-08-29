package com.example.hibernatedemo.service;

import com.example.hibernatedemo.dao.UserDao;
import com.example.hibernatedemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jikangwang
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
    @Autowired
    UserDao userDao;

    @Override
    public void add(Student student) {
        userDao.save(student);
    }

    @Override
    public void delete(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        Iterable<Student> students = userDao.findAll();
        Iterator<Student> iter = students.iterator();
        List<Student> res = new ArrayList<>();
        while(iter.hasNext()) {
            res.add(iter.next());
        }
        return res;
    }

    @Override
    public void update(int id, String name) {
    }

    @Override
    public void deleteById(int id) {
        userDao.deleteStudentById(id);
    }
}
