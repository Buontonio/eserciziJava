package com.example.ex3;

import org.springframework.beans.factory.annotation.Autowired;
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

    public Boolean flightsGenerator() {
        Random r = new Random();
        List<FlightEntity> flights = new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            FlightEntity flight = FlightEntity.builder()
                    .description("Flight nr:" + i)
                    .description(generateRandomString(r))
                    .fromAirport(generateRandomString(r))
                    .toAirport(generateRandomString(r))
                    .flightStatus(FlightStatus.ONTIME)
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
        return flightRepository.findAll();
    }
}
