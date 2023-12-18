package com.example.demo.Domain.Repository;

import com.example.demo.Domain.Entity.Hotel;
import com.example.demo.Domain.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {
}
