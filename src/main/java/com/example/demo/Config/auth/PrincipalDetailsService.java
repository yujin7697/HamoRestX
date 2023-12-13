package com.example.demo.Config.auth;

import com.example.demo.Domain.Dto.UserDto;
import com.example.demo.Domain.Entity.User;
import com.example.demo.Domain.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrincipalDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("[PrincipalDetailsService] loadUserByUsername() username :" + username);
        Optional<User> userOptional = userRepository.findById(username);
        if(userOptional.isEmpty())
            return null;

        //Entity -> Dto
        UserDto dto = new UserDto();
        dto.setUserId(userOptional.get().getUserId());
        dto.setUserPassword(userOptional.get().getUserPassword());
        dto.setRole(userOptional.get().getRole());

        return new PrincipalDetails(dto);
    }

}