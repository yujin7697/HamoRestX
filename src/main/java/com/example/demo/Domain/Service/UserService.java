package com.example.demo.Domain.Service;

import com.example.demo.Domain.Dto.UserDto;
import com.example.demo.Domain.Entity.User;
import com.example.demo.Domain.Repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean joinMember(UserDto dto, Model model, HttpServletRequest request){

        dto.setRole("ROLE_USER");
        dto.setUserPassword(passwordEncoder.encode(dto.getUserPassword()) );

        User user = UserDto.dtoToEntity(dto);
        System.out.println("joinMember's user : " + user);

        userRepository.save(user);

        return true;
    }
}
