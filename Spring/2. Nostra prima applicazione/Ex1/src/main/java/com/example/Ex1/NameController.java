package com.example.Ex1;

import com.example.Ex1.DTO.NameDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1")

public class NameController {


    @GetMapping(path = "/name/{name}")
    public String returnName(@PathVariable String name) {
        return name;
    }


    @PostMapping(path = "/reversedName/{name}")
    public StringBuilder reversedName(@PathVariable String name) {
        StringBuilder finalWord = new StringBuilder(((name)));
        return finalWord.reverse();
    }
}
