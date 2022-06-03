package com.wadson.scanningapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/add")
    public String login(){
        return "add";
    }


    @GetMapping("/list")
    public String list(){
        return "list";
    }
}
