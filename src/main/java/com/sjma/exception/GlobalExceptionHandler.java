package com.sjma.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	@ExceptionHandler(exception = MethodArgumentNotValidException.class)
	public Map<String,String> handleMethodArgumentNotvalidException(MethodArgumentNotValidException ex) {
		
		Map<String, String> fieldError = new HashMap<>();
		ex.getBindingResult().getFieldErrors()
        .forEach(error ->
                fieldError.put(error.getField(), error.getDefaultMessage()));
		
		return fieldError;
	}
	
	
	
	

}
