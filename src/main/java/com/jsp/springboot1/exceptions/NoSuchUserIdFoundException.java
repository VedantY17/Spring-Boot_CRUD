package com.jsp.springboot1.exceptions;

public class NoSuchUserIdFoundException extends Exception {
	
	public NoSuchUserIdFoundException() {
		super("No user found with mentioned ID");
	}

}
