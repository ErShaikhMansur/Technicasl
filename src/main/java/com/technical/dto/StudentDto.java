package com.technical.dto;

public class StudentDto {

	private long id;
	private String studentname;
	private SchoolDto school;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SchoolDto getSchool() {
		return school;
	}
	public void setSchool(SchoolDto school) {
		this.school = school;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public StudentDto(long id, String studentname, SchoolDto school) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.school = school;
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", studentname=" + studentname + ", school=" + school + "]";
	}
	
	
	
	
}
