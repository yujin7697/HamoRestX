package com.example.demo.Controller;

import com.example.demo.Domain.Entity.Hotel;
import com.example.demo.Domain.Service.HotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class MasterController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/admin/adminMain")
    public String adminMain() {

        return "/admin/adminMain";

    }

    @GetMapping("/admin/hotelPermit")
    public String hotelPermit(Model model) {

        //모든 숙소 리스트 가져오기
        List<Hotel> hotelList = hotelService.getHotelList();
        model.addAttribute("hotels", hotelList);

        return "/admin/hotelPermit";

    }
}
