package com.technical.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technical.dto.SchoolDto;
import com.technical.dto.StudentDto;
import com.technical.entity.School;
import com.technical.repository.SchoolRepo;
import com.technical.utility.StudentMapper;

@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolRepo schoolRepo;

	@Autowired
	private StudentMapper mapper;

	@Override
	@Transactional
	public SchoolDto saveSchool(SchoolDto dto) {
		System.out.println("before Convert" + dto.getId() + dto.getSchoolname());
		School school = mapper.convertDtoToSchoolEntity(dto);
		System.out.println("After  Convert" + school.toString());
		schoolRepo.save(school);
		return mapper.convertEntitytoToSchoolDto(school);
	}

	@Override
	@Transactional
	public List<SchoolDto> getAllSchool() {
		List<School> list = schoolRepo.findAll();
		return mapper.convertEntityListToDtoList(list);
	}

	@Override
	@Transactional
	public SchoolDto findById(long id) {
		School list= schoolRepo.findById(id).get();
		return mapper.convertEntitytoToSchoolDto(list);
	}

	@Override
	public SchoolDto findBySchoolname(String schoolname) {
	School name=schoolRepo.findBySchoolname(schoolname);
		return mapper.convertEntitytoToSchoolDto(name);
	}

}
