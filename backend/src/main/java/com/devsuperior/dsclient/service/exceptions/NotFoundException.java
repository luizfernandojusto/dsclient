package com.devsuperior.dsclient.service.exceptions;

public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NotFoundException(String msg) {
		super(msg);
	}

}