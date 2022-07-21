package com.example.test.Exception;


@SuppressWarnings("serial")
public class CustomException extends Exception{

	public CustomException() {
		super();
	}
	
	public CustomException(String errors) {
		super(errors);
	}
}

