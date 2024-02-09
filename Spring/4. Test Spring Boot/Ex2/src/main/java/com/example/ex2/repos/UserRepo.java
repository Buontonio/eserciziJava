package com.example.ex2.repos;

import com.example.ex2.ents.UserEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEnt, Long> {
}
