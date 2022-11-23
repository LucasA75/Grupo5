package com.javaspringboot.spring.service;

import com.javaspringboot.spring.model.User;

public interface UserService {
    User getUser(Integer id);

    User save(User user);

    void delete(Integer id);

}
