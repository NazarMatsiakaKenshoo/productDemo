package com.demo3.demo3.repository;

import com.demo3.demo3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    Optional<User> findById(Long userId); // і це для чого??
}
