package com.example.demo.Domain.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Hotel {

    @jakarta.persistence.Id
    private int hotelId;
    private String ownerId;
    private String hotelAddr;
    private String hotelInfo;
    private String hotelName;

}