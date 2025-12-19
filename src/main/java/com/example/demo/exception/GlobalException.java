package com.example.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice

public class GlobalException{
@ExceptionHandler(ValidationException.class)
public ResponseEntity<String> handleValidationException(ValidationException ex){
    return new ResponseEntity<String> (ex.getMessage(),HttpStatus.BAD_GATEWAY);

}
}