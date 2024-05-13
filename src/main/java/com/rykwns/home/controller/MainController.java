package com.rykwns.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {
    @GetMapping("index")
    public String getMethodName() {
        return "index";
    }

    @GetMapping("test1")
    public String getMethodName(@RequestParam String param) {
        return "test1";
    }
    
    
    
}
