package com.example.Ex5.repositories;

import com.example.Ex5.entities.ProgrammingLanguageEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepo extends JpaRepository<ProgrammingLanguageEnt,Long> {
}
