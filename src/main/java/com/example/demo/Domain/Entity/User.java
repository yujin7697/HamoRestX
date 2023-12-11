package com.example.demo.Domain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="user")
public class User {
    @Id
    private String userId;
    private String userPassword;
    private String userName;
    private String userPhone;
    private String userBirth;

    private String role;

}