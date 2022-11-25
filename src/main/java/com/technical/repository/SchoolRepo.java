package com.technical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technical.dto.SchoolDto;
import com.technical.entity.School;

@Repository
public interface SchoolRepo  extends JpaRepository<School,Long>{
	
	public School findBySchoolname(String schoolname);
}
