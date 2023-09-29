package com.demo3.demo3.service;

import com.demo3.demo3.dto.UserDto;
import com.demo3.demo3.model.User;
import com.demo3.demo3.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public User createUser(UserDto userDto) {

        User user = userRepository.save(userDto.toUser());

        return user;
    }
}
