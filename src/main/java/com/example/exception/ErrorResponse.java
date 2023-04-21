package com.example.exception;

import org.springframework.http.HttpStatus;

public class ErrorResponse 
{

	String message;
	HttpStatus status;
	public ErrorResponse(String message, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.status = httpStatus;
	}
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", status=" + status + "]";
	}
}
