package com.gpswoxapi.deviceinfo.services;


import com.gpswoxapi.deviceinfo.models.Users;
import com.gpswoxapi.deviceinfo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {







    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Users save(Users users){
        return this.userRepository.save(users);
    }

    public Optional<Users> findById(Long userId){
        return this.userRepository.findById(Math.toIntExact(userId));
    }

    public Users findByEmail(String email){
        return this.userRepository.findUsersByEmail(email);
    }

}
