package com.cfs.JPAPRACTICE.controller;


import com.cfs.JPAPRACTICE.entity.Student;
import com.cfs.JPAPRACTICE.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/all")
    public List<Student> getAllStudent(){
        return service.getAllStudentData();
    }
}
