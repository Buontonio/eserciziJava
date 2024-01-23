package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")

public class students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column (unique = true, nullable = false)
    private String email;
}
