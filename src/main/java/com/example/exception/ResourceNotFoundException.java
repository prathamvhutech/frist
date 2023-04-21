package com.example.exception;


public class ResourceNotFoundException extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int status;
	private String message;
	public ResourceNotFoundException(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public ResourceNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
