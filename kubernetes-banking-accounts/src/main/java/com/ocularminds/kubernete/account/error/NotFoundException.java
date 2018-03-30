package com.ocularminds.kubernete.account.error;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class NotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NotFoundException(String accountNumber) {
		super("No such account: " + accountNumber);
	}
	
}
