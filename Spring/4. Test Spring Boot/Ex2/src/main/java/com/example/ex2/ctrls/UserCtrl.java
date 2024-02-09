package com.example.ex2.ctrls;

import com.example.ex2.dto.UserUpdate;
import com.example.ex2.ents.UserEnt;
import com.example.ex2.servs.UserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")

public class UserCtrl {

    @Autowired
    private UserServ userServ;


    @PostMapping("/create/user")
    public UserEnt createNewUser(@RequestBody UserEnt user) {
        return userServ.createNewUser(user);
    }

    @GetMapping("/get/all/users")
    public List<UserEnt> getAllUsers() {
        return userServ.getAllUsers();
    }

    @GetMapping("/get/user/id/{id}")
    public Optional<UserEnt> getUserById(@PathVariable long id) {
        return userServ.getUserById(id);
    }

    @PatchMapping("/update/user/id/{id}")
    public Optional<UserEnt> updateUserById(@PathVariable long id, @RequestBody UserUpdate update) {
        return userServ.updateUserData(id, update);
    }

    @DeleteMapping("/delete/user/id/{id}")
    public Boolean deleteUserById(@PathVariable long id) {
        return userServ.deleteUserById(id);
    }
}
