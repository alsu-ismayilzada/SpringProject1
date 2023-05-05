package com.example.springproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
@ControllerAdvice
public class CustumizedUserExteption extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleeException(Exception ex, WebRequest request) throws Exception{
         UserExceptionDetails userExceptionDetails= new UserExceptionDetails(LocalDateTime.now(),
                 ex.getMessage(),
                 request.getDescription(false));
            return new ResponseEntity(userExceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
