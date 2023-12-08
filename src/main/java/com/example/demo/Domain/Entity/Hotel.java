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
    int hotelId;
    String ownerId;
    String hotelAddr;
    String reserveId;
    String hotelName;

}
