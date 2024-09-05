package com.JAPKAM.Movieverse.advice;

import com.JAPKAM.Movieverse.exception.MovieNotFoundException;
import com.JAPKAM.Movieverse.exception.UnavailableSeatException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({MovieNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse method(Exception exception) {
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), exception.getMessage());
    }
    @ExceptionHandler({UnavailableSeatException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse unavailableSeat(Exception exception) {
        return new ErrorResponse(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
    }



}