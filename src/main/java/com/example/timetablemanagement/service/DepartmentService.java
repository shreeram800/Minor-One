package com.example.timetablemanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.timetablemanagement.entity.Department;
import com.example.timetablemanagement.entity.Major;

public interface DepartmentService {

	
	List<Department> getDepartments();
	
	Department createDepartment(Department department);
	
	List<Department> findDepartmentByName(String name);
	
	String deleteDepartment(long id);
	
	Department getDepartmentById(long id);
	
	Department updateDepartment(long id, Department department);
	
	Page<Department> searchDepartments(String keyword,Pageable pageable);
	
	List<Major> getMajorByDepartmentId(long id);
	
}
