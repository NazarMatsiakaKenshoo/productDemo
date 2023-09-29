package com.demo3.demo3.controller;

import com.demo3.demo3.dto.UserDto;
import com.demo3.demo3.model.User;
import com.demo3.demo3.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("users")
public class UserController {

    private UserService userService;

    @GetMapping
    public Iterable<User> getUsers() {

        return userService.getUsers();
    }

    @PostMapping
    public User createUser(@Valid @RequestBody UserDto userDto) {

        return userService.createUser(userDto);
    }

}
