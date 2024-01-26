package com.example.Ex4.repositories;

import com.example.Ex4.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<CarEntity, Long> {
}
