package com.example.Ex4.controllers;
import com.example.Ex4.entities.CarEntity;
import com.example.Ex4.repositories.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/v1")

public class CarController {

    @Autowired
    private CarRepo carRepo;

    @GetMapping("/getAllCars")

    public List<CarEntity> getAllCars() {
      return carRepo.findAll();
    }

    @PostMapping("/createCar")

    public CarEntity createCar(@RequestBody CarEntity car) {
        return carRepo.saveAndFlush(car);
    }
}
