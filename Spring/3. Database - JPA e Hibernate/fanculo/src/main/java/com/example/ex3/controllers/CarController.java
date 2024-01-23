package com.example.ex3.controllers;

import com.example.ex3.dto.UpdateTypeRequest;
import com.example.ex3.entities.CarEntity;
import com.example.ex3.repositories.CarRepository;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.models.media.Content;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.AbstractDocument;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping(path = "/create")
    public CarEntity createCar(@RequestBody CarEntity carEntity) {
        return carRepository.saveAndFlush(carEntity);
    }

    @GetMapping("/getAll")
    public List<CarEntity> getAllCars() {
        return carRepository.findAll();
    }

    @PatchMapping("/car/{id}/updateType")
    public Optional<CarEntity> updateType(@RequestBody UpdateTypeRequest request, @PathVariable long id) {
        Optional<CarEntity> oldCar = carRepository.findById(id);
        if (oldCar.isPresent()) {
            oldCar.get().setType(request.getUpdatedType());
            carRepository.saveAndFlush(oldCar.get());
            return oldCar;
        } else {
            return Optional.empty();
        }
    }

    @DeleteMapping("/car/{id}/deleteCar")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "409", description = "L'auto non esiste")
            })


    public ResponseEntity<Void> deleteCar(@PathVariable long id) {
        Optional<CarEntity> toDeleteCar = carRepository.findById(id);
        if (toDeleteCar.isPresent()) {
            carRepository.deleteById(id);
            System.out.println("Car correctly deleted.");
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            System.out.println("Car not found");
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/deleteAllCars")

    public List<CarEntity> deleteAllCars() {
        List<CarEntity> toDeleteCar = carRepository.findAll();
        if (!toDeleteCar.isEmpty()) {
            carRepository.deleteAll(toDeleteCar);
            System.out.println("Cars correctly deleted.");
            return toDeleteCar;
        } else {
            return null;
        }
    }
}