package com.dflima.bnbbooking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dflima.bnbbooking.entity.Booking;
import com.dflima.bnbbooking.service.BookingService;

@RestController
public class BookingController {
    private final BookingService service;

    BookingController(BookingService service) {
        this.service = service;
    }

    @GetMapping("/bookings")
    public List<Booking> getAll() {
        return this.service.findAll();
    }

    @GetMapping("/bookings/{code}")
    public Booking getBooking(@PathVariable(value = "code") String code) {
        return this.service.getOneBookingByCode(code);
    }

    @DeleteMapping("/bookings/{code}")
    public void deleteBooking(@PathVariable(value = "code") String code) {
        this.service.deleteBooking(code);
    }
}
