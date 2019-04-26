package com.cg.tdsApplication.userInterfaceExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeIdNotFoundException extends RuntimeException{
	public EmployeeIdNotFoundException(String msg) {
		super(msg);
	}
}
