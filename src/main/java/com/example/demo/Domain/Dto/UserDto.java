package com.example.demo.Domain.Dto;

import com.example.demo.Domain.Entity.User;
import lombok.Data;

@Data
public class UserDto {
    private String userId;
    private String userPassword;
    private String userName;
    private String userPhone;
    private String userBirth;

    //OAUTH2
    private String provider;
    private String providerId;

    public static User dtoToEntity(UserDto dto){
        User user = User.builder()
                .userId(dto.getUserId())
                .userPassword(dto.getUserPassword())
                .userName(dto.getUserName())
                .userPhone(dto.getUserPhone())
                .userBirth(dto.getUserBirth())
                .build();

        return user;
    }

}