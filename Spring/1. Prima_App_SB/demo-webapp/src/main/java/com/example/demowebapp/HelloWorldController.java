package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String helloWorld() {
        return "Ma sì scem?";
    }

    @GetMapping(path = "/ciao")
    public String ciao(@RequestParam(value = "name", required = false, defaultValue = "Antonio") String name, @RequestParam (value = "surname", required = false, defaultValue = "O'scè") String surname) {
        return name + " " + surname + ", " + "ma sì scem? ";
    }
}
