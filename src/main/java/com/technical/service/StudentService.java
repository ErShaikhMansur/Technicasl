package com.technical.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.technical.dto.StudentDto;

@Service
public interface StudentService {

	public StudentDto addStudent(StudentDto dto);
	
	public List<StudentDto> getAll();
}
