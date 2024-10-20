package com.example.timetablemanagement.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.timetablemanagement.entity.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

	@Query("SELECT c FROM Classroom c WHERE c.capacity = ?1")
	Page<Classroom> searchWithPagination(int keyword,Pageable pageable);
	

}
