package com.educacionit;

public class DivisionPorCeroException extends Exception {

	private static final long serialVersionUID = 1L;

	public DivisionPorCeroException(String message) {
		super(message);
	}

	public DivisionPorCeroException(Throwable cause) {
		super(cause);
	}

	public DivisionPorCeroException(String message, Throwable cause) {
		super(message, cause);
	}
}
