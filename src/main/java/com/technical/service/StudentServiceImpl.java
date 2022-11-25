package com.technical.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technical.dto.SchoolDto;
import com.technical.dto.StudentDto;
import com.technical.entity.Student;
import com.technical.repository.StudentRepo;
import com.technical.utility.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private StudentMapper mapper;

	@Override
	public StudentDto addStudent(StudentDto dto) {
		SchoolDto dto1=new SchoolDto();
		dto.setSchool(dto1);
		Student entity = mapper.convertDtoToStudentEntity(dto);
		studentRepo.save(entity);
		return mapper.convertEntityToStudentDto(entity);
	}

	@Override
	@Transactional
	public List<StudentDto>  getAll() {
		return mapper.converEntityListToDtoList(studentRepo.findAll());
	}

}
