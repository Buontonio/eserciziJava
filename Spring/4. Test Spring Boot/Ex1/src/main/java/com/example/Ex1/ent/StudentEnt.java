package com.example.Ex1.ent;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "students")

public class StudentEnt {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private Boolean isWorking;
}
