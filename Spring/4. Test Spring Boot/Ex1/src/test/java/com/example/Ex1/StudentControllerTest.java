package com.example.Ex1;

import com.example.Ex1.controllers.StudentController;
import com.example.Ex1.entities.StudentEntity;
import com.example.Ex1.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
class StudentControllerTest {

    @Autowired
    private StudentController studentController;

    @Autowired
    private StudentService studentService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    void contextLoads() {
        assertThat(studentController).isNotNull();
    }

    @Test
    void createStudent() throws Exception {

        StudentEntity student = new StudentEntity();
        student.setName("Antonio");
        student.setSurname("Buonanno");
        student.setIsWorking(false);

        String studentJson = objectMapper.writeValueAsString(student);

        MvcResult result = this.mockMvc.perform(post("/v1/create/new/student")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(studentJson)).andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        StudentEntity studentResponse = objectMapper.readValue(result.getResponse().getContentAsString(), StudentEntity.class);
        assertThat(studentResponse.getId()).isNotNull();
    }

    @Test
    void getAllStudents() throws Exception {
        studentService.createNewStudent(new StudentEntity(1, "Antonio", "Buonanno", false));
        studentService.createNewStudent(new StudentEntity(2, "Anto", "Troiano", false));

        this.mockMvc.perform(get("/v1/show/all/students")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        assertThat(studentService.getAllStudents().size()).isEqualTo(3);
        assertThat(studentService.getAllStudents()).isNotEmpty();
    }

    @Test
    void getStudentById() throws Exception {
        StudentEntity student = studentService.createNewStudent(new StudentEntity(1, "Anto", "Buono", false));

        this.mockMvc.perform(get("/v1/show/student/by/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

    }

    @Test
    void updateStudentWorkingStatus() throws Exception {
        StudentEntity student = studentService.createNewStudent(new StudentEntity(1, "Anto", "Buono", false));

        this.mockMvc.perform(patch("/v1/update/student/employment/status/1?working=true")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

    }

    @Test
    void deleteStudentById() throws Exception {
        StudentEntity student = studentService.createNewStudent(new StudentEntity(1, "Anto", "Buono", false));

        this.mockMvc.perform(delete("/v1/delete/student/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        assertThat(studentService.getAllStudents()).isEmpty();
    }
}
