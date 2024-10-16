package com.sathwik.applicationTrail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService extends UserDetailsService {
    @Autowired


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    }
}
