package com.example.Ex1.service;

import com.example.Ex1.ent.StudentEnt;
import com.example.Ex1.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ActiveProfiles(value = "test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepo studentRepo;


    @Test
    public void updateStudentEmploymentStatusInvalidId() {

        Optional<StudentEnt> result = studentService.updateStudentEmploymentStatus(-5, true);
        assertEquals(result,Optional.empty());
    }

    @Transactional
    @Test
    public void updateStudentEmploymentStatus() {

        StudentEnt stud = new StudentEnt();
        stud.setName("Pippo");
        stud.setSurname("Pippa");
        stud.setIsWorking(false);

        StudentEnt savedStudent = studentService.createNewStudent(stud);
        long savedStudentId = savedStudent.getId();


        Optional<StudentEnt> result = studentService.updateStudentEmploymentStatus(savedStudentId, true);
        assertEquals(result.get().getId(),savedStudentId);
        assertEquals(result.get().getIsWorking(), true);
    }
}