package org.example.models.dto;

import lombok.Setter;
import lombok.Singular;
import org.example.models.User;

import java.util.List;

public class UsersResponse {
    @Singular
    @Setter
    private List<User> users;

}
