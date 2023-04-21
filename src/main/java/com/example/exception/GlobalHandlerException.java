package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalHandlerException extends ResponseEntityExceptionHandler
{

	@ExceptionHandler(EmailAlreadyExitis.class)
	public ResponseEntity<?> EmailException(EmailAlreadyExitis alreadyExitis)
	{
		ErrorResponse errorResponse=new ErrorResponse(alreadyExitis.getMessage(), alreadyExitis.getStatus());
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> EmailException(ResourceNotFoundException ex)
	{
		Response response=new Response( ex.getMessage(), ex.getStatus());
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
