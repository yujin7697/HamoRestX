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
@Table(name="owner")
public class Owner {
    @Id
    private String ownerId;
    private String ownerPassword;
    private String ownerPhone;
    private String ownerEmail;
    private String role;
}