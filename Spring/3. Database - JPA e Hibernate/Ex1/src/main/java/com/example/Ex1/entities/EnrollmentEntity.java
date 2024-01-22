package com.example.Ex1.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "enrollment")

public class EnrollmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private StudentEntity studentEntity;

    @ManyToOne
    private ClassEntity classEntity;
}
