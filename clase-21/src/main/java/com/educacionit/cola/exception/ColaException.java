package com.educacionit.cola.exception;

public class ColaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ColaException() {
	}

	public ColaException(String message) {
		super(message);
	}

	public ColaException(Throwable cause) {
		super(cause);
	}

	public ColaException(String message, Throwable cause) {
		super(message, cause);
	}

	public ColaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
