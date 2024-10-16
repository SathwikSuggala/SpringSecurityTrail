package com.sathwik.applicationTrail.controller;

import com.sathwik.applicationTrail.entity.User;
import com.sathwik.applicationTrail.service.MyUserService;
import com.sathwik.applicationTrail.service.UserService;
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

        return "Success";
    }
}
