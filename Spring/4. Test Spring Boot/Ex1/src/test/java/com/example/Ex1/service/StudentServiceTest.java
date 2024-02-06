package com.example.Ex1.service;

import com.example.Ex1.entities.StudentEntity;
import com.example.Ex1.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles(value = "test")
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;

    private StudentEntity createNewStudent() {
        StudentEntity student = new StudentEntity();
        student.setName("Antonio");
        student.setSurname("Buonanno");
        student.setIsWorking(false);

        return studentRepository.saveAndFlush(student);
    }

    @Test
    void createNewStudentTest() throws Exception {

        StudentEntity student = new StudentEntity();
        student.setName("Anto");
        student.setSurname("Troiano");
        student.setIsWorking(false);

        StudentEntity studentDB = studentRepository.save(student);

        assertThat(studentDB).isNotNull();
        assertThat(studentService.createNewStudent(studentDB)).isEqualTo(student);
    }

    @Test
    void getStudentsTest() throws Exception {
        createNewStudent();

        assertThat(studentRepository.findAll().size()).isNotZero();
        assertThat(studentService.getAllStudents()).contains(new StudentEntity(1, "Antonio", "Buonanno", false));
    }

    @Test
    void getByIdTest(){
       StudentEntity student = new StudentEntity();
        student.setName("Antonio");
        student.setSurname("Buonanno");
        student.setIsWorking(false);

        studentRepository.save(student);
        StudentEntity studentFind = studentRepository.findById(student.getId()).get();
        assertThat(studentFind.getId()).isNotNull();
        assertThat(studentFind.getId()).isEqualTo(student.getId());
        assertThat(studentService.getStudentById(student.getId())).isEqualTo(Optional.of(student));
    }

    @Test
    void updateStatusStudent(){
        StudentEntity student = new StudentEntity();
        student.setName("Antonio");
        student.setSurname("Buonanno");

        studentRepository.saveAndFlush(student);


        assertThat(studentService.updateStudentEmploymentStatus(1,true)).isEqualTo(studentService.getStudentById(1));

    }

    @Test
    void deleteStudentTest(){
        StudentEntity student = new StudentEntity();
        student.setName("Antonio");
        student.setSurname("Buonanno");
        student.setIsWorking(false);

        studentRepository.saveAndFlush(student);


        assertThat(studentService.deleteStudent(1)).isNull();
        assertThat(studentService.getAllStudents().size()).isZero();
    }


}