package com.miniProject;

public class InvalidIdException extends java.lang.Exception{
private String message = "Invalid user ID";
	
	public InvalidIdException(String message) {
		super(message);
	}
}
