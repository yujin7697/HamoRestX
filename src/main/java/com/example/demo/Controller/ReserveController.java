package com.example.demo.Controller;

import com.example.demo.Domain.Entity.Hotel;
import com.example.demo.Domain.Service.HotelService;
import com.example.demo.Domain.Service.ReserveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
public class ReserveController {

    private ReserveService reserveService;

    @GetMapping("/reservation/{hotelId}")
    public String reservation(@PathVariable("hotelId") int hotelId, Model model){
        System.out.println("GET /reservation/"+hotelId);

        Hotel hotel = reserveService.getHotelOne(hotelId);

        return "reservation";
    }
}
