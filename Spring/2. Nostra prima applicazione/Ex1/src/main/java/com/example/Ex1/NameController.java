package com.example.Ex1;

import com.example.Ex1.DTO.NameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;

@RestController
@RequestMapping(path = "/v1")

public class NameController {


    @GetMapping(path = "/name{name}")
    public String returnName(@PathVariable String name) {
        return name;
    }

    @PostMapping(path = "/reversedName")
    public String reversedName(@RequestParam () String name) {


        StringBuilder finalWord = new StringBuilder(name);
        return finalWord.reverse().toString();
    }
}
