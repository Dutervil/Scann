package com.wadson.scanningapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ScanningApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScanningApplication.class, args);
    }


}
