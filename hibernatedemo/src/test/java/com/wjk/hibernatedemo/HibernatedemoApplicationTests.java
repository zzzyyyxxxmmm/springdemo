package com.wjk.hibernatedemo;

import com.wjk.hibernatedemo.entity.Student;
import com.wjk.hibernatedemo.service.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernatedemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @Test
    public void testJDBC() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","root","root");
        Statement statement=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet=statement.executeQuery("select * from student");
        while(resultSet.next()){
            String name=resultSet.getString("name");
            resultSet.updateString("name","wang");
            resultSet.updateRow();
        }
        connection.close();
    }

    @Test
    public void addStudent(){
        studentServiceImpl.add(new Student("wang"));
        studentServiceImpl.getAll().forEach(System.out::println);
    }

    @Test
    public void testDelete(){
        studentServiceImpl.deleteById(4);
    }
    @Test
    public void updateStudent(){

    }

}
