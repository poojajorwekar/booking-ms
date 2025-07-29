package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class book {
    @GetMapping("/book")
    public String getData() {
        return "Please  give book discount 30% ";
    }
}