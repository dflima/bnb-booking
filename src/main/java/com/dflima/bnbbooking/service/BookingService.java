package com.dflima.bnbbooking.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.dflima.bnbbooking.entity.Booking;
import com.dflima.bnbbooking.exception.BookingNotFoundException;
import com.dflima.bnbbooking.repository.BookingRepository;

@Service
public class BookingService {
    private final BookingRepository repository;

    public BookingService(BookingRepository repository) {
        this.repository = repository;
    }

    public List<Booking> findAll() {
        return this.repository.findAll();
    }

    public Booking getOneBookingByCode(String code) throws BookingNotFoundException {
        return this.repository.findOneByCode(code)
                .orElseThrow(() -> new BookingNotFoundException(code));
    }

    public void deleteBooking(String code) {
        this.repository.deleteByCode(code);
    }
}
