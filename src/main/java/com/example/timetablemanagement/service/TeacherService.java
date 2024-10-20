package com.example.timetablemanagement.service;

import java.util.List;

import com.example.timetablemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.example.timetablemanagement.entity.Teacher;

public interface TeacherService {
	
	 Teacher createTeacher(Teacher teacher)throws Exception ;
	 
	 Teacher findTeacherById(Long teacherId) throws Exception;
	 
	 String deleteTeacher(long teacherId);
	 
	 Page<User> getTeachers(Pageable pageable);
	 
	 Teacher updateTeacher(Teacher teacher,long teacherId) throws Exception;
	 
	 Page<Teacher> searchTeachers(String keyword,Pageable pageable);
	 
	 List<Teacher> getAllTeachers();
	 
	 List<Teacher> findTeacherByName(String name);

}
