package com.xc.study.framework.springmvc.inaction.bean.po;

import java.util.Map;

public class ApiPO {

	private int id;

	private String url;

	private String method;

	private Map<String, String> params;

	private Map<String, String> heads;

	public ApiPO() {
	}

	public ApiPO(int id, String url, String method) {
		super();
		this.id = id;
		this.url = url;
		this.method = method;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public Map<String, String> getHeads() {
		return heads;
	}

	public void setHeads(Map<String, String> heads) {
		this.heads = heads;
	}

}
