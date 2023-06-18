package com.example.test.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MainController {
    @GetMapping("/")
    public String Shawarmas(Model m) {
        return "main";
    }
}
