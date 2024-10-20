package com.example.timetablemanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.timetablemanagement.entity.Classroom;

public interface ClassroomService {

	Classroom createClassroom(Classroom classroom);
    Classroom findClassromById(long id) throws Exception ;
    String deleteClassroom(Long id);
    Classroom updateClassroom(Classroom classroom,long classroomId);
    List<Classroom> findAllClassrooms();

    Page<Classroom> searchClassrooms(int keyword, Pageable pageable);
    
    Page<Classroom> getClassrooms(Pageable pageable);
    
}
