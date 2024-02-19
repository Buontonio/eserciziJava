package com.example.ex4;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Long> {

    @Query(value = "SELECT * FROM flights", nativeQuery = true)
    List<FlightEntity> showAllFlights();

    @Query(value = "SELECT * FROM flights ORDER BY from_airport", nativeQuery = true)
    Page<FlightEntity> getPagedFlights(Pageable pageable);

    @Query(value = "SELECT * FROM flights WHERE flight_status = :p1 OR flight_status = :p2", nativeQuery = true)
    List<FlightEntity> getFlightsOfStatuses(@Param(value = "p1") String stat1, @Param(value = "p2") String stat2);

    List<FlightEntity> findFlightByFlightStatus(FlightStatus status);

}
