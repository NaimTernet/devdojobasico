package br.com.devdojo.awesome.handler;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.devdojo.awesome.error.ResourceNotFoundDetails;
import br.com.devdojo.awesome.error.ResourceNotFoundException;

@ControllerAdvice
public class RestExceptionHandler {

	private MultiValueMap rfnDetails;

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rfnException) {
		ResourceNotFoundDetails rfnDetails = new ResourceNotFoundDetails();
		rfnDetails.setTimestamp(new Date().getTime());
		rfnDetails.setStatus(HttpStatus.NOT_FOUND.value());
		rfnDetails.setTitle("Resource not found");
		rfnDetails.setDetails(rfnException.getMessage());
		rfnDetails.setDeveloperMessage(rfnException.getMessage());
		return new ResponseEntity(rfnDetails, HttpStatus.NOT_FOUND);
	}

	private ResourceNotFoundDetails buid() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
