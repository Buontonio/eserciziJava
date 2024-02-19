package com.example.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;


    public Boolean flightsGenerator(int n) {
        Random r = new Random();
        List<FlightEntity> flights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            FlightEntity flight = FlightEntity.builder()
                    .description("Flight nr:" + i)
                    .description(generateRandomString(r))
                    .fromAirport(generateRandomString(r))
                    .toAirport(generateRandomString(r))
                    .flightStatus(generateRandomStatus(r))
                    .build();

            flights.add(flight);
        }
        flightRepository.saveAllAndFlush(flights);
        return true;
    }

    private String generateRandomString(Random random) {
        return IntStream.range(0, 5)
                .mapToObj(i -> String.valueOf((char) ('A' + random.nextInt(26))))
                .collect(Collectors.joining());
    }

    public List<FlightEntity> viewFlights() {
        return flightRepository.showAllFlights();
    }

    private FlightStatus generateRandomStatus(Random random) {

        return FlightStatus.values()[random.nextInt(FlightStatus.values().length)];
    }

    public Page<FlightEntity> getPagedFlights(int size, int page) {
        Pageable pageable = Pageable.ofSize(size).withPage(page);
        return flightRepository.getPagedFlights(pageable);
    }

//    public List<FlightEntity> getFlightsByStatus(String desiredStatus) {
//        List<FlightEntity> allFLights = flightRepository.findAll();
//        List<FlightEntity> desiredFlights = new ArrayList<>();
//        for (FlightEntity f : allFLights) {
//            if (f.getFlightStatus().toString().equals(desiredStatus)) {
//                desiredFlights.add(f);
//            }
//        }
//        return desiredFlights;
//    }

    public List<FlightEntity> findByStatus(FlightStatus status) {
        return flightRepository.findFlightByFlightStatus(status);
    }

    public List<FlightEntity> getFlightsByCustomStatus(String stat1, String stat2) {
        return flightRepository.getFlightsOfStatuses(stat1, stat2);
    }
}
