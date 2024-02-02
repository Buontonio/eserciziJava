package com.example.Ex1.service;

import com.example.Ex1.ent.StudentEnt;
import com.example.Ex1.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentEnt createNewStudent(StudentEnt studentEnt) {
//        StudentEnt student = new StudentEnt();
//        student.setName(studentEnt.getName());
//        student.setSurname(studentEnt.getSurname());
//        student.setIsWorking(studentEnt.getIsWorking());
        return studentRepo.save(studentEnt);
    }

    public List<StudentEnt> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<StudentEnt> getStudentById(long id) {
        return studentRepo.findById(id);
    }

    public Optional<StudentEnt> updateStudentEmploymentStatus(long id, Boolean working) {
        Optional<StudentEnt> studentToUpdate = studentRepo.findById(id);
        if ((studentToUpdate.isPresent())) {
            studentToUpdate.get().setIsWorking(working);
            studentRepo.save(studentToUpdate.get());
            return studentToUpdate;
        }
        return Optional.empty();
    }

    public Boolean deleteStudent(long id) {
        boolean studentExists = studentRepo.existsById(id);
        if (studentExists) {
            studentRepo.deleteById(id);
        }
        return true;
    }
}
