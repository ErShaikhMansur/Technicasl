package com.technical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technical.dto.StudentDto;
import com.technical.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping(value = "/save")
	public ResponseEntity<StudentDto> save(@RequestBody StudentDto dto){
		return new ResponseEntity<>(service.addStudent(dto),HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/getAll")
	public ResponseEntity<List<StudentDto>> getAll(){
		return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
	}
}
