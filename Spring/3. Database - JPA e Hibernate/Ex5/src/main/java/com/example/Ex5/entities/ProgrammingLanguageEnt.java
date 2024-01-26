package com.example.Ex5.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;

import java.sql.Date;
import java.time.OffsetDateTime;

@Data
@Entity
@Table(name = "ProgrammingLanguages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class ProgrammingLanguageEnt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Date firstAppearance;

    private String inventor;
}
