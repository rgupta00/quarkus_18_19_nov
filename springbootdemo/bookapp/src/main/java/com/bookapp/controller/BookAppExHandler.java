package com.bookapp.controller;

import com.bookapp.dto.ErrorInfo;
import com.bookapp.exceptions.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class BookAppExHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<ErrorInfo> handle404(BookNotFoundException ex){
        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setTimestamp(LocalDateTime.now());
        errorInfo.setMessage(ex.getMessage());
        errorInfo.setStatusCode(HttpStatus.NOT_FOUND.toString());
        errorInfo.setToContact("foo@foo.com");

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
    }
}
