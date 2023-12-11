package com.example.demo.Domain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Room {
    @Id
    private int roomId;
    private int hotelId;
    private String roomName;
    private int roomPrice;
    private String roomInTime;
    private String roomOutTime;
    private String roomDetails;
}