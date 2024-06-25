package me.dio.santander_bank.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.santander_bank.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String account);
}
