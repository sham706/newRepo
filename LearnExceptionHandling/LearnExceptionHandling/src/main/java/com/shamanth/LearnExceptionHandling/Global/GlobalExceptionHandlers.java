package com.shamanth.LearnExceptionHandling.Global;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlers {
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Object> handleIllegalException(IllegalArgumentException e) {
		return new ResponseEntity<Object>("IllegalArgumentException", HttpStatus.BAD_REQUEST);
	}
}
