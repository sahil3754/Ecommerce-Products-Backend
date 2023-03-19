package com.example.demo.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    String l1[]={"Welcome","Sahil","Kushwaha","Mast"};
    @GetMapping("/")
    @CrossOrigin(origins = "http://localhost:4200/")
    public String[] hellos() {
        
        return l1;
    }
}
