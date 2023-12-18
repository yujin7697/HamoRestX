package com.example.demo.Controller;

import com.example.demo.Domain.Dto.OwnerDto;
import com.example.demo.Domain.Dto.UserDto;
import com.example.demo.Domain.Service.OwnerService;
import com.example.demo.Domain.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/ownerLogin")
    public void ownerLogin(){

        log.info("GET /ownerLogin");
    }


}
