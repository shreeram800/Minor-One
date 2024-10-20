package com.example.timetablemanagement.service.imp;

import java.util.List;
import com.example.timetablemanagement.repository.ModuleElementRepository;
import org.springframework.stereotype.Service;
import com.example.timetablemanagement.entity.ModuleElement;
import com.example.timetablemanagement.service.ModuleElementService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ModuleElementServiceImpl implements ModuleElementService {

	private final ModuleElementRepository moduleElementRepository;

	@Override
	public List<ModuleElement> getModuleElement() {
		return moduleElementRepository.findAll();
	}

	@Override
	public ModuleElement addModuleElement(ModuleElement moduleElement) {
		return moduleElementRepository.save(moduleElement);
	}

	@Override
	public String deleteModuleElement(Long id) {
		try {
			getModuleElementById(id);
			moduleElementRepository.deleteById(id);
			return "DELETED SUCCESSFULLY";
		}catch(Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public ModuleElement getModuleElementById(Long id) {
		return moduleElementRepository.findById(id).orElseThrow(() -> new RuntimeException("This module not found with id " + id));
	}

	@Override
	public ModuleElement updateModuleElement(Long id, ModuleElement moduleElement) {
		moduleElement.setId(id);
		return moduleElementRepository.save(moduleElement);
	}

	@Override
	public List<ModuleElement> getSchedulesByClass(Long classId) {
		return moduleElementRepository.getSchedulesByClass(classId);
	}
	
	
}
