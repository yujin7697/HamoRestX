package com.example.demo.Domain.Service;

import com.example.demo.Domain.Dto.OwnerDto;
import com.example.demo.Domain.Dto.UserDto;
import com.example.demo.Domain.Entity.Owner;
import com.example.demo.Domain.Entity.User;
import com.example.demo.Domain.Repository.OwnerRepository;
import com.example.demo.Domain.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

}
