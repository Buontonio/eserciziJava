package com.example.ex2.servs;

import com.example.ex2.dto.UserUpdate;
import com.example.ex2.ents.UserEnt;
import com.example.ex2.repos.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServTest {

    @Autowired
    private UserServ userServ;

    @Autowired
    private UserRepo userRepo;

    @Test
    void UserCreationTest() {
        UserEnt expected = new UserEnt();
        expected.setName("Antonio");
        expected.setSurname("Buonanno");

        UserEnt actual = userServ.createNewUser(expected);

        assertEquals(expected, actual);
    }

    @Test
    void GetAllUsersTest() {
        UserEnt exp1 = new UserEnt();
        exp1.setName("Antonio");
        exp1.setSurname("Buonanno");

        UserEnt exp2 = new UserEnt();
        exp2.setName("Antonio");
        exp2.setSurname("Troiano");

        userRepo.save(exp1);
        userRepo.save(exp2);

        assertThat(userServ.getAllUsers().size()).isNotZero();
        assertThat(userServ.getAllUsers().contains(exp1));
    }

    @Test
    void GetUserByIdTest() {
        Optional<UserEnt> expected = Optional.of(new UserEnt());
        expected.get().setName("Antonio");
        expected.get().setSurname("Buonanno");

        userRepo.save(expected.get());

        assertEquals(expected, userServ.getUserById(1));
    }

    @Test
    void UpdateUserDataTest() {
        Optional<UserEnt> expected = Optional.of(new UserEnt());

        expected.get().setName("Antonio");
        expected.get().setSurname("Buonanno");

        userRepo.save(expected.get());

        assertEquals(expected, userServ.getUserById(1));

        UserUpdate userUpdate = new UserUpdate();
        userUpdate.setUpdatedName("Anto");
        userUpdate.setUpdatedSurname("Buono");

        expected.get().setName(userUpdate.getUpdatedName());
        expected.get().setSurname(userUpdate.getUpdatedSurname());
        userRepo.save(expected.get());

        assertEquals(expected, userServ.updateUserData(1, userUpdate));

    }

    @Test
    void deleteUserByIdTest() {
        Optional<UserEnt> expected = Optional.of(new UserEnt());
        expected.get().setName("Antonio");
        expected.get().setSurname("Buonanno");

        userRepo.save(expected.get());

        assertEquals(expected, userServ.getUserById(1));

        userServ.deleteUserById(1);

        assertThat(userServ.getUserById(1).isEmpty());
    }

}