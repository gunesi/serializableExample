package com.serialization.entity;

public class Student extends Person{
	
	private static final long serialVersionUID = 1L;
	
	private String schoolNumber;

	public String getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	
}
