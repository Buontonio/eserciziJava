package com.example.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")

public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/generate")
    public Boolean generateFlights(@RequestParam(name = "n", defaultValue = "100") int n) {
        return flightService.flightsGenerator(n);
    }

    @GetMapping("/view")
    public List<FlightEntity> viewFlights() {
        return flightService.viewFlights();
    }

    @GetMapping("/get/flights/pagedFromAirport")
    public Page<FlightEntity> getPagedFlights(@RequestParam(name = "size", defaultValue = "10") int size,
                                              @RequestParam(name = "page", defaultValue = "0") int page) {
        return flightService.getPagedFlights(size, page);
    }

    @GetMapping("/get/flights/byStatus")
    public List<FlightEntity> getFlightsByStatus(@RequestParam(name = "desiredStatus") String desiredStatus) {
        return flightService.getFlightsByStatus(desiredStatus);
    }

    @GetMapping("/get/flights/byCustomStatuses")
    public List<FlightEntity> getFlightsByCustomStatuses(@RequestParam(name = "s1") String stat1, @RequestParam(name = "s2") String stat2) {
        return flightService.getFlightsByCustomStatus(stat1, stat2);
    }
}
