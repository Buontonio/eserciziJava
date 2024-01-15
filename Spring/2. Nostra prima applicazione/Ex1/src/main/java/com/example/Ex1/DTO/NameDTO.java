package com.example.Ex1.DTO;


import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Data
public class NameDTO {

    private String name;


    public NameDTO(String name) {
        this.name = name;
    }

}
