package com.example.deployex1.ctrls;

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

    @GetMapping("/getProperty")
    public String getDev() {
        return environment.getProperty("devName");
    }

}
