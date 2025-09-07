package com.jwctech.symmetricjwtspringboot.service;

import com.jwctech.symmetricjwtspringboot.entity.User;

import com.jwctech.symmetricjwtspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepo;

    public List<User> getUsers(){
        return userRepo.findAll();
    }

    public User addUser(User user){
        return userRepo.save(user);
    }
}
