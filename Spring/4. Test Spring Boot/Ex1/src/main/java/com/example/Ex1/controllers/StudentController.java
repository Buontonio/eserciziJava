package com.example.Ex1.controllers;


import com.example.Ex1.entities.StudentEntity;
import com.example.Ex1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/v1")

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/create/new/student")
    public @ResponseBody StudentEntity createNewStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.createNewStudent(studentEntity);
    }

    @GetMapping(value = "/show/all/students")
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/show/student/by/{id}")
    public Optional<StudentEntity> getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
    }

    @PatchMapping(value = "/update/student/employment/status/{id}")
    public Optional<StudentEntity> updateStudentEmploymentStatus(@PathVariable long id, @RequestParam(name = "working", required = false) Boolean working) {
        return studentService.updateStudentEmploymentStatus(id, working);
    }

    @DeleteMapping(value = "/delete/student/{id}")
    public Boolean deleteStudent(@PathVariable long id) {
        return studentService.deleteStudent(id);
    }
}
