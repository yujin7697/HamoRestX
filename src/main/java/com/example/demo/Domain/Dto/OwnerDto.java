package com.example.demo.Domain.Dto;

import com.example.demo.Domain.Entity.Owner;
import com.example.demo.Domain.Entity.User;
import lombok.Data;

@Data
public class OwnerDto {

    private String ownerId;
    private String ownerPassword;
    private String ownerEmail;
    private String ownerPhone;
    private String role;


    public static Owner dtoToEntity(OwnerDto dto){
        Owner owner = Owner.builder()
                .ownerId(dto.getOwnerId())
                .ownerPassword(dto.getOwnerPassword())
                .ownerEmail(dto.getOwnerEmail())
                .ownerPhone(dto.getOwnerPhone())
                .role(dto.getRole())
                .build();

        return owner;
    }

}
