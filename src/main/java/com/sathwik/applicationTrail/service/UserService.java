package com.sathwik.applicationTrail.service;

import com.sathwik.applicationTrail.entity.User;
import com.sathwik.applicationTrail.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDetailsRepository repository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public void addUser(User user) {


        // Check if username already exists
        if (repository.findByUsername(user.getUserName()).isPresent()) {
            throw new IllegalArgumentException("User with the same username already exists");
        }

        // Encrypt the password
        String encryptedPassword = encoder.encode(user.getPassword());
        user.setPassword(encryptedPassword);

        // Save the user to the repository
        repository.save(user);
    }
}
