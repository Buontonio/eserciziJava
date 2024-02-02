package com.example.Ex1.repo;

import com.example.Ex1.ent.StudentEnt;
import com.example.Ex1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepo extends JpaRepository<StudentEnt, Long> {


}
