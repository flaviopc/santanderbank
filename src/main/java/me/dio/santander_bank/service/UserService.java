package me.dio.santander_bank.service;

import me.dio.santander_bank.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);
}
