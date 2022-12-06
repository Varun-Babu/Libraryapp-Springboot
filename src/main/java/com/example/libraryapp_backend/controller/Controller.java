package com.example.libraryapp_backend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/")
    public String Home(){
        return "home";
    }

    @PostMapping("/add")
    public String Add(){
        return "add";
    }

    @PostMapping("/search")
    public String Search(){
        return "search";
    }

    @PostMapping("/delete")
    public String Delete(){
        return "Delete";
    }

    @PostMapping("/edit")
    public String Edit(){
        return "Edit";
    }
}
