package com.example.ex1logging.controllers;

import com.example.ex1logging.services.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MainController {


    @Autowired
    private CalcService calcService;

    @GetMapping("/")
    public String helloMessage() {
        return "Hello, World!";
    }

    @GetMapping("/exp")
    public String exponent() {
        return calcService.calcExp();
    }

    @GetMapping("/get-errors")
    public String newError() {
        return calcService.throwError();
    }
}
