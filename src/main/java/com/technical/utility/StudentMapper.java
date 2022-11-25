package com.technical.utility;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.technical.dto.SchoolDto;
import com.technical.dto.StudentDto;
import com.technical.entity.School;
import com.technical.entity.Student;

/**
 * @author shaikh Mansur
 *
 */
@Component
public class StudentMapper {

	public Student convertDtoToStudentEntity(StudentDto dto) {
		Student entity = new Student();
		entity.setId(dto.getId());
		entity.setStudentname(dto.getStudentname());
		entity.setSchool(convertDtoToSchoolEntity(dto.getSchool()));
		return entity;

	}

	public School convertDtoToSchoolEntity(SchoolDto dto) {
		School entity = new School();
		entity.setId(dto.getId());
		entity.setSchoolname(dto.getSchoolname());
		return entity;
	}

	public StudentDto convertEntityToStudentDto(Student entity) {
		StudentDto dto = new StudentDto();
		dto.setId(entity.getId());
		dto.setStudentname(entity.getStudentname());
		dto.setSchool(convertEntitytoToSchoolDto(entity.getSchool()));

		return dto;
	}

	public SchoolDto convertEntitytoToSchoolDto(School entity) {
		SchoolDto dto = new SchoolDto();
		dto.setId(entity.getId());
		dto.setSchoolname(entity.getSchoolname());
		return dto;
	}
	
	public List<SchoolDto> convertEntityListToDtoList(List<School> list){
		return list.stream().map(x->convertEntitytoToSchoolDto(x)).collect(Collectors.toList());
	}
	public List<StudentDto> converEntityListToDtoList(List<Student> list){
		return list.stream().map(x->convertEntityToStudentDto(x)).collect(Collectors.toList());
	}
}
