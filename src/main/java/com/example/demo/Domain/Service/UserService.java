package com.example.demo.Domain.Service;

import com.example.demo.Domain.Dto.UserDto;
import com.example.demo.Domain.Entity.User;
import com.example.demo.Domain.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean Join(UserDto dto){

        //비지니스 Validation Check

        //Dto->Entity
        User user = new User();
        user.setUserName(dto.getUserName());
        user.setUserPassword(dto.getUserPassword());
        user.setRole(dto.getRole());
        user.setRole("ROLE_USER");

        //Db Saved...
        userRepository.save(user);

        return userRepository.existsById(user.getUserName());
    }
}
