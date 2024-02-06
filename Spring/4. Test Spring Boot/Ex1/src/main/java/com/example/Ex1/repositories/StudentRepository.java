package com.example.Ex1.repositories;

import com.example.Ex1.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {


}
