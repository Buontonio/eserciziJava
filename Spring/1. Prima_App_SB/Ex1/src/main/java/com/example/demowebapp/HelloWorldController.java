package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class HelloWorldController {

    @GetMapping(path = "/ciao")
    public String ciao(@RequestParam String name, @RequestParam String province ) {
        return "Ciao "+ name + ", " + "com'è il tempo in " + province + "?";
    }


}
