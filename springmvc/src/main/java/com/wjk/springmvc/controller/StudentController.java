package com.wjk.springmvc.controller;

import com.wjk.common.CommonResult;
import com.wjk.hibernatedemo.entity.Student;
import com.wjk.hibernatedemo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jikangwang
 * http://localhost:8080/swagger-ui.html#/
 */
@RestController
@RequestMapping("/api")
@Api(value = "User", description = "REST API for Users", tags = {"User"})
public class StudentController {

    @Autowired
    StudentService studentService;

    @ApiOperation(value = "gets all students")
    @GetMapping("/student")
    public CommonResult getStudents() {
        List<Student> list=studentService.getAll();
        if(list==null){
            return CommonResult.failed();
        }
        return CommonResult.success(list);
    }

    @GetMapping(value = "/student/{sid}")
    public CommonResult getStudentById(@PathVariable("sid") long id) {
        Student student=studentService.findStudentById(id);
        if(student==null){
            return CommonResult.failed();
        }
        return CommonResult.success(student);
    }

    @PostMapping(value = "/student", consumes = "application/json")
    public void addStudent(@RequestBody Student student) {
        studentService.add(student);
    }

    @PutMapping(value = "/student/{sid}", consumes = "application/json")
    public void updateStudent(@PathVariable("sid") long id, @RequestBody Student student) {
        //studentService.updateStudent(id, student);
    }


}
