package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @RequestMapping("/hello")
    public String index() {
        return "MapBar";
    }
}
