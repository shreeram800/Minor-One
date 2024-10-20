package com.example.timetablemanagement.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.timetablemanagement.entity.Semester;
import com.example.timetablemanagement.service.SemesterService;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/semesters")
@RequiredArgsConstructor
public class SemesterController {



	private final SemesterService semesterService;
	
	 @GetMapping
	    public List<Semester> getAllSemester() {
	        return semesterService.getSemesters();
	    }

	    @GetMapping("/{id}")
	    public Semester getSemesterById(@PathVariable Long id) {
	        return semesterService.getSemesterById(id);
	    }

	    @PostMapping
	    public Semester createSemester(@RequestBody Semester semester) {
	        return semesterService.addSemster(semester);
	    }

	    @PutMapping("/{id}")
	    public Semester updateSemester(@PathVariable Long id, @RequestBody Semester updatedSemester) {
	        return semesterService.updateSemester(id, updatedSemester);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteSemester(@PathVariable Long id) {
	        return semesterService.deleteSemester(id);
	    }
}
