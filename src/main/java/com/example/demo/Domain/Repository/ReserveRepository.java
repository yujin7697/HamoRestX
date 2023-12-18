package com.example.demo.Domain.Repository;

import com.example.demo.Domain.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReserveRepository extends JpaRepository<Hotel,String> {
    //숙소 아이디로 숙소 정보 받아오기
    Optional<Hotel> findByHotelId(int hotelId);
}
