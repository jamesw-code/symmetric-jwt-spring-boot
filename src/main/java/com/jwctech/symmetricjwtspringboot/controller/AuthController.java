package com.jwctech.symmetricjwtspringboot.controller;

import com.jwctech.symmetricjwtspringboot.entity.User;
import com.jwctech.symmetricjwtspringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getUsers();
    }

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }
}
