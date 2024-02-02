package com.example.Ex1.ctrl;


import com.example.Ex1.ent.StudentEnt;
import com.example.Ex1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/v1")

public class StudentCtrl {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "create/new/student")
    public StudentEnt createNewStudent(@RequestBody StudentEnt studentEnt) {
        return studentService.createNewStudent(studentEnt);
    }

    @GetMapping(value = "show/all/students")
    public List<StudentEnt> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(value = "show/student/by/{id}")
    public Optional<StudentEnt> getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
    }

    @PatchMapping(value = "update/student/employment/status/{id}")
    public Optional<StudentEnt> updateStudentEmploymentStatus(@PathVariable long id, @RequestParam(name = "working", required = false) Boolean working) {
        return studentService.updateStudentEmploymentStatus(id, working);
    }

    @DeleteMapping(value = "delete/student/{id}")
    public Boolean deleteStudent(@PathVariable long id) {
        return studentService.deleteStudent(id);
    }
}
