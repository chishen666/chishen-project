package com.xc.study.framework.springmvc.inaction.bean.result;

import com.xc.study.framework.springmvc.inaction.exception.BaseException;

public class ResultBean<T> {

	private T result;

	private int errorCode;

	private String errorMessge;

	public ResultBean(T result) {
		super();
		this.result = result;
	}

	public ResultBean(T result, int errorCode, String errorMessge) {
		super();
		this.result = result;
		this.errorCode = errorCode;
		this.errorMessge = errorMessge;
	}

	public ResultBean(T result, BaseException e) {
		super();
		this.result = result;
		this.errorCode = 1;
		this.errorMessge = e.getMessage();
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessge() {
		return errorMessge;
	}

	public void setErrorMessge(String errorMessge) {
		this.errorMessge = errorMessge;
	}

}
