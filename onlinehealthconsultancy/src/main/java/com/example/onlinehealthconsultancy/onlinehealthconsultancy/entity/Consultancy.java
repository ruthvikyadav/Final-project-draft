package com.example.onlinehealthconsultancy.onlinehealthconsultancy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consultancy {
	
	@Id
	private Integer consultancyId;
	
	@Column(length = 15)
	private String consultancyName;

	public Integer getConsultancyId() {
		return consultancyId;
	}

	public void setConsultancyId(Integer consultancyId) {
		this.consultancyId = consultancyId;
	}

	public String getConsultancyName() {
		return consultancyName;
	}

	public void setConsultancyName(String consultancyName) {
		this.consultancyName = consultancyName;
	}

	

	
	

	

	
	
	
}
