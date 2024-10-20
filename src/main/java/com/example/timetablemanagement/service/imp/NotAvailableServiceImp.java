package com.example.timetablemanagement.service.imp;

import java.util.ArrayList;
import java.util.List;

import com.example.timetablemanagement.repository.NotAvailableRepository;
import com.example.timetablemanagement.service.NotAvailableService;
import org.springframework.stereotype.Service;

import com.example.timetablemanagement.entity.NotAvailable;
import com.example.timetablemanagement.entity.Teacher;
import com.example.timetablemanagement.service.TeacherService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotAvailableServiceImp implements NotAvailableService {
	
	private final NotAvailableRepository notAvailableRepository;
	
	private final TeacherService teacherService;
	
	@Override
	public List<NotAvailable> getNotAvailables() {
		return notAvailableRepository.findAll();
	}

	@Override
	public NotAvailable addNotAvailable(NotAvailable notAvailable) {
		return notAvailableRepository.save(notAvailable);
	}

	@Override
	public String deleteNotAvailable(Long id) {
		try {
			getNotAvailableById(id);
			notAvailableRepository.deleteById(id);
            return "Deleted Successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
	}

	@Override
	public NotAvailable getNotAvailableById(Long id) {
		 return notAvailableRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}

	@Override
	public NotAvailable updateNotAvailable(Long id, NotAvailable notAvailable) {
		notAvailable.setId(id);
        return notAvailableRepository.save(notAvailable);
	}

	@Override
	public List<NotAvailable> getNotAvailableByTeacherId(Long id) throws Exception {
		Teacher teacher = teacherService.findTeacherById(id);
        return new ArrayList<>(teacher.getNotAvailables());
	}

}
