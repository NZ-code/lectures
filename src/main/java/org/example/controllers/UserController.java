package org.example.controllers;

import org.example.models.User;
import org.example.models.dto.UsersResponse;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    public UsersResponse getUsers() {
        UsersResponse usersResponse = new UsersResponse();
        List<User> users = List.of(
                new User("Nick",23),
                new User("Alex", 50),
                new User("Mia", 34));
        usersResponse.setUsers(users);
        return usersResponse;
    }
}
