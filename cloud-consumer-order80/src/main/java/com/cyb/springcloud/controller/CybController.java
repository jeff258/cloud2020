package com.cyb.springcloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CybController {

@GetMapping("test")
    public String testcyb(){
        return "success";
    }

}
