package com.example.test.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
@SuppressWarnings("serial")
public class CustomException extends Exception{

	public CustomException() {
		super();
	}
	
	public CustomException(String errors) {
		super(errors);
	}
}

