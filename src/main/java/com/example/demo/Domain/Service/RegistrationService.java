package com.example.demo.Domain.Service;

import com.example.demo.Domain.Dto.HotelDto;
import com.example.demo.Domain.Entity.Hotel;
import com.example.demo.Domain.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private HotelRepository hotelRepository;

    public boolean hotelAdd(HotelDto dto){

        System.out.println("호텔을 추가하는 서비스 호출 완료");

        Hotel hotel = HotelDto.dtoToEntity(dto);
        System.out.println("hotelAdd's hotel : " + hotel);

        hotelRepository.save(hotel);

        return true;
    }
}
