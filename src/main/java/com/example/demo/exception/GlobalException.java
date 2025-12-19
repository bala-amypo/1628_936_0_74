package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice

public class GlobalException{
@ExceptionHandler(ValidationException.class)
public String handleValidationException(ValidationException ex)
return ex.getMessage();
}