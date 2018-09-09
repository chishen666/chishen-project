package com.carrx.springmvc.inaction.exception;

public class BaseException extends Exception {

	private static final long serialVersionUID = 1L;

	private String code;

	public BaseException(String code, String message) {
		super(message);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
