package com.example.demo.Controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home(){
        log.info("GET /");
        return "NonLoginMain";
    }

    @GetMapping("/login")
    public String login(){
        log.info("GET /login");
        return "login";
    }

//    @GetMapping("/user")
//    public void user(){
//        log.info("GET /user");
//
//    }
    @GetMapping("/member")
    public void member(){
        log.info("GET /member");
    }
    @GetMapping("/master")
    public void master(){
        log.info("GET /master");
    }

}