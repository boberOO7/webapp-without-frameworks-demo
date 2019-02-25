package com.liakhovskyi.service;

import com.liakhovskyi.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> authorize(User user);

}
