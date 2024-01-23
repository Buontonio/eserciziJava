package com.example.ex3.entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String modelName;

    @Column
    private String type;

}
