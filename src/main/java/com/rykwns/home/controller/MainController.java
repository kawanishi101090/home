package com.rykwns.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;



@Controller
public class MainController {

    @Autowired
    private JdbcTemplate JdbcTemplate;

    @GetMapping("index")
    public String getMethodName() {
        return "index";
    }

    @GetMapping("test")
    public String getMethodName(Model model) {
        String sql = "SELECT MESSAGE FROM TEST";
        String message = JdbcTemplate.queryForObject(sql, String.class);
        model.addAttribute("message",message);
        System.out.println(model);
        return "test";
    }
    
    
    
}
