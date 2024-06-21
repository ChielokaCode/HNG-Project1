package com.chielokacodes.project1.controller;

import com.chielokacodes.project1.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private HttpServletRequest request;

    @PostMapping("/hello")
    public ResponseEntity<User> getName(@RequestParam String visitor_name){
        String bodyGreeting ="Hello, " + visitor_name + "!";
        User user = User.builder()
                .client_ip(request.getRemoteAddr())
                .location(request.getLocale().getCountry())
                .greeting(bodyGreeting)
                .build();

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
