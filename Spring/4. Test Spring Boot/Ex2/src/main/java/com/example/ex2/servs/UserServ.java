package com.example.ex2.servs;

import com.example.ex2.dto.UserUpdate;
import com.example.ex2.ents.UserEnt;
import com.example.ex2.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServ {

    @Autowired
    private UserRepo userRepo;

    public UserEnt createNewUser(UserEnt user) {
        return userRepo.save(user);
    }

    public List<UserEnt> getAllUsers() {
        return userRepo.findAll();
    }

    public Optional<UserEnt> getUserById(long id) {
        return userRepo.findById(id);
    }

    public Optional<UserEnt> updateUserData(long id, UserUpdate update) {
        Optional<UserEnt> user = userRepo.findById(id);

        if (user.isPresent()) {
            user.get().setName((update.getUpdatedName()));
            user.get().setSurname((update.getUpdatedSurname()));
            return Optional.of(userRepo.saveAndFlush(user.get()));
        }
        return Optional.empty();
    }

    public Boolean deleteUserById(long id) {
        Optional<UserEnt> userToDelete = userRepo.findById(id);
        if (userToDelete.isPresent()) {
            userRepo.deleteById(id);
            return true;
        }
        return null;
    }
}
