package com.example.demo.Controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home(Authentication authentication , Model model){
        if (authentication != null) {
            log.info("GET /...Authentication" + authentication);
            log.info("username : " + authentication.getName());
            log.info("principal : " + authentication.getPrincipal());
            log.info("authorities : " + authentication.getAuthorities());
            log.info("details :  " + authentication.getDetails());
            log.info("credentials : " + authentication.getCredentials());

            System.out.println(authentication);
            model.addAttribute("authentication", authentication);
        }


        return "main";
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