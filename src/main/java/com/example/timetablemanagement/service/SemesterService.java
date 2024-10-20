package com.example.timetablemanagement.service;

import java.util.List;
import com.example.timetablemanagement.entity.enums.SemesterNumber;
import com.example.timetablemanagement.entity.Semester;
public interface SemesterService {
	
	List<Semester> getSemesters();
	
	Semester addSemster(Semester semester);
	
	String deleteSemester(long id);
	
	Semester getSemesterById(long id);
	
	Semester updateSemester(long id, Semester semster);
	
	List<Semester> findSemesterByNum(SemesterNumber num);

}
