package com.dflima.bnbbooking.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dflima.bnbbooking.exception.BookingNotFoundException;

@ControllerAdvice
public class BookingNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(BookingNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public String bookingNotFoundHandler(BookingNotFoundException ex) {
        return ex.getMessage();
    }
}
