package com.example.demo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MasterController {

    @GetMapping("/admin/adminMain")
    public String adminMain() {

        return "/admin/adminMain";

    }

    @GetMapping("/admin/hotelPermit")
    public String hotelPermit() {

        return "/admin/hotelPermit";

    }
}
