package com.xc.study.framework.springmvc.inaction.bean.po;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class SpittlePO {

	private Long id;

	private String message;

	private Date time;

	private Double latitude;

	private Double longitude;

	public SpittlePO(String message, Date time) {
		super();
		this.message = message;
		this.time = time;
	}

	public SpittlePO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public SpittlePO(Long id, String message, Date time, Double latitude, Double longitude) {
		super();
		this.id = id;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that, "id", "time");
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "time");
	}

}
