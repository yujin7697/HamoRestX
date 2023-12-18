package com.example.demo.Domain.Service;

import com.example.demo.Domain.Entity.Hotel;
import com.example.demo.Domain.Entity.Reserve;
import com.example.demo.Domain.Repository.HotelRepository;
import com.example.demo.Domain.Repository.ReserveRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReserveService {

    private ReserveRepository reserveRepository;

    //숙소 예약 눌렀을 때 선택된 숙소
    public Reserve getHotelOne(int hotelId) {
        System.out.println("getHotelOne : " + hotelId);
        Optional<Hotel> optionalReserve = reserveRepository.findByHotelId(hotelId);
        System.out.println("optionalHotel : "+optionalHotel);

        if(!optionalHotel.isEmpty()) {

            return optionalHotel.get();
        }
        return null;
    }
}
