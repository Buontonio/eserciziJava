package com.example.deployex3.ctrls;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")

public class BasicController {

    private final Environment environment;

    public BasicController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/getProperties")
    public String getDev() {
        String firstProp = environment.getProperty("devName");
        String secondProp = environment.getProperty("authCode");
        return "Hi " + firstProp + " :)"+ " This is your authentication code: " + secondProp;
    }

}
