package br.com.devdojo.awesome.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.devdojo.awesome.error.ResourceNotFoundDetails;
import br.com.devdojo.awesome.error.ResourceNotFoundDetails.Builder;
import br.com.devdojo.awesome.error.ResourceNotFoundException;

@ControllerAdvice
public class RestExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rfnException) {
		ResourceNotFoundDetails rfnDetails = ResourceNotFoundDetails
		.builder()
		.withTimestamp(new Date().getTime())
		.withStatus(HttpStatus.NOT_FOUND.value())
		.withTitle("Resource not found")
		.withDetails(rfnException.getMessage())
		.withDeveloperMessage(rfnException.getClass(),getName());
		return new ResponseEntity(rfnDetails,HttpStatus.NOT_FOUND);
		
	}

	private Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
