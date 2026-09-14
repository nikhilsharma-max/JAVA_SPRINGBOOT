package com.cfs.JPAPRACTICE.service;


import com.cfs.JPAPRACTICE.entity.Student;
import com.cfs.JPAPRACTICE.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudentData(){
        return (List<Student> ) repository.findAll();
    }
}
