package com.example.timetablemanagement.repository;

import java.util.List;

import com.example.timetablemanagement.entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.timetablemanagement.entity.enums.SemesterNumber;

public interface SemesterRepository extends JpaRepository<Semester, Long> {
	
	List<Semester> findByNumber(SemesterNumber number);

}
