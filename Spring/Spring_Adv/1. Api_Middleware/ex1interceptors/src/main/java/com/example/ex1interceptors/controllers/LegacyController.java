package com.example.ex1interceptors.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")

public class LegacyController {

    @GetMapping
    public String legacyMethod() {
        return "This is just old code";
    }
}
