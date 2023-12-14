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
    private OwnerRepository ownerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean joinOwner(OwnerDto dto){

        dto.setRole("ROLE_OWNER");
        dto.setOwnerPassword(passwordEncoder.encode(dto.getOwnerPassword()) );

        Owner owner = OwnerDto.dtoToEntity(dto);
        System.out.println("joinOwner's owner : " + owner);

        ownerRepository.save(owner);

        return true;
    }
}
