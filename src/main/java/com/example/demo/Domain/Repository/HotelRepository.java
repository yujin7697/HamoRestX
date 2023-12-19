package com.example.demo.Domain.Repository;

import com.example.demo.Domain.Entity.Hotel;
import com.example.demo.Domain.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {

    //모든 숙소 조회
    List<Hotel> findAll();


    Optional<Hotel> findByHotelId(int hotelId);
}
