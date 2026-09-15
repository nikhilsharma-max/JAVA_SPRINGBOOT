package com.cfs.JPAPRACTICE.service;


import com.cfs.JPAPRACTICE.entity.Student;
import com.cfs.JPAPRACTICE.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudentData(){
        return (List<Student> ) repository.findAll();
    }

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public Student getStudentById(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Student not found"));
    }

    public void deleteById(Long id){
         repository.deleteById(id);
    }
}
