package com.example.Ex1.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Entity
@Validated
@Table(name="Student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (nullable = false)
    private String firstName;

    @Column (nullable = false)
    private String lastName;


    @Column (nullable = false, unique = true)
    private String email;

    @OneToMany
    private List<EnrollmentEntity> enrollmentEntities;
}
