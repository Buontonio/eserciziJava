package com.example.ex3.repositories;
import com.example.ex3.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

}
