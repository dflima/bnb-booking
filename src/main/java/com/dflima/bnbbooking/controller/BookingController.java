package com.dflima.bnbbooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @GetMapping("/booking/{code}")
    public String getBooking(@PathVariable(value = "code") String code) {
        return "getBooking";
    }
}
