package com.dflima.bnbbooking.exception;

public class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException(String code) {
        super(String.format("Booking %s not found.", code));
    }
}
