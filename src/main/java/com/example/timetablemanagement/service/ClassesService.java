package com.example.timetablemanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.timetablemanagement.entity.Classes;

public interface ClassesService {
	
	Classes createLesson(Classes lesson, long majorId) throws Exception;
	
	Classes findLessonById(long lessonId) throws Exception;

	
	String deleteLesson(long lessonId);
	
	List<Classes> getAllLessons();
	
	 Classes updateLesson(long lessonId,Classes lesson) throws Exception;

	Page<Classes> getLessons(Pageable pageable);
	
	Page<Classes> searchLessons(String keyword, Pageable pageable);
	
	Page<Classes> searchLessons(String keyword,Long sem, Pageable pageable);
}
