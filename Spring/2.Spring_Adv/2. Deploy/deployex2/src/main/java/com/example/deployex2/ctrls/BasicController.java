package com.example.deployex2.ctrls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/v1")

public class BasicController {

    @GetMapping("/sumOfInts")
    public int getRandomInt() {
        Random r = new Random();
        int num1 = r.nextInt();
        int num2 = r.nextInt();

        return num1 + num2;
    }
}
