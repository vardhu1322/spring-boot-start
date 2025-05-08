package com.javatech.vardhu.Exception.handler;


import com.javatech.vardhu.Exception.DataNotFoundException;
import com.javatech.vardhu.model.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<?> handleSchoolNotFoundException(DataNotFoundException exception) {

        return new ResponseEntity<>(ResponseDto.builder().statusCode(HttpStatus.NOT_FOUND.value()).message(exception.getMessage()).build(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<?> exception(Exception exception) {

        return new ResponseEntity<>(ResponseDto.builder().statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value()).message(exception.getMessage()).build(), HttpStatus.NOT_FOUND);
    }
}