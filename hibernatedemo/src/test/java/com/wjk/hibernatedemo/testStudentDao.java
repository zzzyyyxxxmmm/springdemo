package com.wjk.hibernatedemo;

import com.wjk.hibernatedemo.dao.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jikangwang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testStudentDao {

    @Autowired
    StudentDao studentDao;
    @Test
    public void test(){
        //System.out.println(studentDao.findStudentByCount(90));
    }
}
