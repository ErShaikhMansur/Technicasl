package com.technical.dto;

public class SchoolDto {


	@Override
	public String toString() {
		return "SchoolDto [id=" + id + ", schoolname=" + schoolname + "]";
	}
	private long id;
	
	private String schoolname ;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	
}
