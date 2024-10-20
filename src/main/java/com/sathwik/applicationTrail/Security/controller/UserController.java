package com.sathwik.applicationTrail.Security.controller;

import com.sathwik.applicationTrail.Security.entity.User;
import com.sathwik.applicationTrail.Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    public UserService service;

    @PostMapping("/register")
    public String userRegistration(@RequestBody User user){

        service.addUser(user);
        return "Success";
    }

    @PostMapping("/Hello")
    public String checking(){

        return "Hello world";
    }
}
