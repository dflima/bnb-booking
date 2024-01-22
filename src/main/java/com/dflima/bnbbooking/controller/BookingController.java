package com.dflima.bnbbooking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dflima.bnbbooking.entity.Booking;
import com.dflima.bnbbooking.exception.BookingNotFoundException;
import com.dflima.bnbbooking.repository.BookingRepository;

@RestController
public class BookingController {
    private final BookingRepository repository;

    BookingController(BookingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/booking")
    public List<Booking> getAll() {
        return this.repository.findAll();
    }

    @GetMapping("/booking/{code}")
    public Booking getBooking(@PathVariable(value = "code") String code) {
        return this.repository.findOneByBookingCode(code)
            .orElseThrow(() -> new BookingNotFoundException(code));
    }

    @DeleteMapping("/booking/{code}")
    public void deleteBooking(@PathVariable(value = "code") String code) {
        this.repository.deleteByBookingCode(code);
    }
}
