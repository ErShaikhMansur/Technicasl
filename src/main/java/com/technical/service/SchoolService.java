package com.technical.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.technical.dto.SchoolDto;
import com.technical.dto.StudentDto;

@Service
public interface SchoolService {

	public SchoolDto saveSchool(SchoolDto dto);
	
	public List<SchoolDto> getAllSchool();
	
	public SchoolDto findById(long id);
	 
	public SchoolDto findBySchoolname(String schoolname);
  }
