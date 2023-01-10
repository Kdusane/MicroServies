package com.example.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/name")
    public String getName(){

        return "kunal";
    }

    @GetMapping("/address")
    public String getAddress(){

        return "kunal123123";
    }

    @GetMapping("/status")
    public String getStatus(){

        return "Active";
    }
}
