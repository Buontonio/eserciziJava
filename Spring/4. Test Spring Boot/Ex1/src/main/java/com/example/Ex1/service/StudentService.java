package com.example.Ex1.service;

import com.example.Ex1.entities.StudentEntity;
import com.example.Ex1.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentEntity createNewStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<StudentEntity> getStudentById(long id) {
        return studentRepository.findById(id);
    }

    public Optional<StudentEntity> updateStudentEmploymentStatus(long id, Boolean working) {
        Optional<StudentEntity> studentToUpdate = studentRepository.findById(id);
        if ((studentToUpdate.isPresent())) {
            studentToUpdate.get().setIsWorking(working);
            studentRepository.save(studentToUpdate.get());
            return studentToUpdate;
        }
        return Optional.empty();
    }

    public Boolean deleteStudent(long id) {
        boolean studentExists = studentRepository.existsById(id);
        if (studentExists) {
            studentRepository.deleteById(id);
        }
        return null;
    }
}
