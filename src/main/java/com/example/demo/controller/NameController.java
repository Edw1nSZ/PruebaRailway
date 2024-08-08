package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/prueba")
public class NameController {

    @GetMapping("/nombre")
    public String getName() {
        return "Edwin Cruz";
    }
}
