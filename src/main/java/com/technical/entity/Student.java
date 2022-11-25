package com.technical.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
  @Table(name = "Student")
public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String studentname;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="SchId")
	private School school;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", school=" + school + "]";
	}
	
	
}

































