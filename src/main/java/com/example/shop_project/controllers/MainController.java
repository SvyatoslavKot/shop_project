package com.example.shop_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class MainController {

    @GetMapping()
    public String mainView(){
        return "main";
    }
}
