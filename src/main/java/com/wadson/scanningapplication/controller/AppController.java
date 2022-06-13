package com.wadson.scanningapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("nom","WADSON");
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


    @GetMapping("/add-product")
    public String addProduct(){
        return "addProduct";
    }


    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

}
