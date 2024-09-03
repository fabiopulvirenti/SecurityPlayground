package com.example.SecurityPlayground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Controller {

    @GetMapping("/open/greeting")
    public  String greetingFormal(){
        return "Good morning Sir";
    }

    @GetMapping("/protected/greeting")
    public  String greetingFamiliar(){
        return "hi, how are you doing today";
    }


}
