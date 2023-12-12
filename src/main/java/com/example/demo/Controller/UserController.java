package com.example.demo.Controller;

import com.example.demo.Domain.Dto.UserDto;
import com.example.demo.Domain.Service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/user")
    public void user(Authentication authentication , Model model){
        log.info("GET /user...Authentication : " + authentication);
        log.info("username : " + authentication.getName());
        log.info("principal : " + authentication.getPrincipal());
        log.info("authorities : " + authentication.getAuthorities());
        log.info("details :  " +authentication.getDetails());
        log.info("credentials : " + authentication.getCredentials());

        model.addAttribute("authentication",authentication);

    }

    @GetMapping("/join")
    public void join(){
        log.info("GET /join");
    }

    @PostMapping("/join")
    public String join_post(UserDto dto, Model model, HttpServletRequest request) {
        log.info("POST /join "+dto);

        boolean isjoin = userService.joinMember(dto,model,request);

        if(!isjoin){
            return "login";
        }
        return "redirect:/login?msg=Join_Success!";

    }


}
