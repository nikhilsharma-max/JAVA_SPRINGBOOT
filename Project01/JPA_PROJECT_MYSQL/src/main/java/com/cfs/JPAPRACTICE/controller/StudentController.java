package com.cfs.JPAPRACTICE.controller;


import com.cfs.JPAPRACTICE.entity.Student;
import com.cfs.JPAPRACTICE.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id){
        return service.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
        service.deleteById(id);
        return "Student deleted successfully";
    }
}
