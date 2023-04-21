package com.example.exception;

public class Response 
{

	private int status;
	private String message;
	public Response(String message, int status) {
		super();
		this.status = status;
		this.message = message;
	}
	public Response() {
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
