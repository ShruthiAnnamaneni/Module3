package com.cg.tdsApplication.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.tdsApplication.dto.ErrorMessageDetails;
import com.cg.tdsApplication.userInterfaceExceptions.EmployeeIdNotFoundException;

@ControllerAdvice
@RestController
public class ExceptionsHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = EmployeeIdNotFoundException.class)
	 public final ResponseEntity<ErrorMessageDetails> handleNotFoundException(EmployeeIdNotFoundException ex, WebRequest request) {
		ErrorMessageDetails errorMessageDetails = new ErrorMessageDetails(new Date(), ex.getMessage(),
		        request.getDescription(false));
		    return new ResponseEntity<>(errorMessageDetails, HttpStatus.NOT_FOUND);
	   }

}
