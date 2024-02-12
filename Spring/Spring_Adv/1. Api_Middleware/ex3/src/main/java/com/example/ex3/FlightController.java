package com.example.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")

public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/generate")
    public Boolean generateFlights() {
        return flightService.flightsGenerator();
    }

    @GetMapping("/view")
    public List<FlightEntity> viewFlights() {
        return flightService.viewFlights();
    }
}
