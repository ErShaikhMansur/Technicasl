package com.technical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technical.dto.SchoolDto;
import com.technical.service.SchoolService;

@RestController
@RequestMapping(value = "/school")
public class SchoolController {

	@Autowired
	private SchoolService service;

	@PostMapping(value = "/save")
	public ResponseEntity<SchoolDto> save(@RequestBody SchoolDto dto) {
		return new ResponseEntity<>(service.saveSchool(dto), HttpStatus.CREATED);

	}
	
	@GetMapping(value="/getAll")
	public ResponseEntity<List<SchoolDto>> getallSchool(){
		return new ResponseEntity<>(service.getAllSchool(),HttpStatus.OK);
	}
	
	@GetMapping(value="/id/{id}")
	public ResponseEntity<SchoolDto> findById(@PathVariable long id){
		return new ResponseEntity<>(service.findById(id),HttpStatus.OK);
	}
	
	@GetMapping(value="/name/{name}")
	public ResponseEntity<SchoolDto> findById(@PathVariable String name){
		return new ResponseEntity<>(service.findBySchoolname(name),HttpStatus.OK);
	}
}
