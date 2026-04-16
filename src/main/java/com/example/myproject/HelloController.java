package com.example.myproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

    @GetMapping("/hello")
    public String hello()
    {
        System.out.println("Hello GET API called....");
        return "Day 1 Project Setup is readyyy...!!!";
    }

    @GetMapping("/AreYouReadyyy")
    public String Welcome()
    {
        System.out.println("Welcom GET API is Called....");
        return "Are you ready......!!!";
    }

    @GetMapping("/AboutDeveloper")
    public String about()
    {
        return "Surya Mahesh Kolisetty @2026.";
    }

}
