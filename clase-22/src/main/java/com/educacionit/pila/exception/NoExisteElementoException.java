package com.educacionit.pila.exception;

public class NoExisteElementoException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoExisteElementoException() {
	}

	public NoExisteElementoException(String message) {
		super(message);
	}

	public NoExisteElementoException(Throwable cause) {
		super(cause);
	}

	public NoExisteElementoException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoExisteElementoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
