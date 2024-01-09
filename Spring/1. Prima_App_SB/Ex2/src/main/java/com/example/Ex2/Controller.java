package com.example.Ex2;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")

public class Controller {


    @GetMapping(path = "/ciao/{province}")
    public User myMethod(
            @PathVariable(required = true) String province,
            @RequestParam(value = "name", required = false, defaultValue = "") String name) {

        String greet = "Ciao " + name + "! Com'è oggi il tempo in " + province;
        return new User(name, province, greet);
    }
}
