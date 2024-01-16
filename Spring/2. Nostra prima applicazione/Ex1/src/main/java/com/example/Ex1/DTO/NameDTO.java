package com.example.Ex1.DTO;


import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Data
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class NameDTO {

    private String name;
}
