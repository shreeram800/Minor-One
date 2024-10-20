package com.example.timetablemanagement.service.imp;

import java.util.List;

import com.example.timetablemanagement.repository.ModuleRepository;
import org.springframework.stereotype.Service;

import com.example.timetablemanagement.entity.Module;
import com.example.timetablemanagement.service.ModuleService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ModuleServiceImp implements ModuleService {
	
	private final ModuleRepository moduleRepository;
	
	@Override
	public List<Module> getModules() {
		return moduleRepository.findAll();
	}

	@Override
	public Module addModule(Module module) {
		return moduleRepository.save(module);
	}

	@Override
	public String deleteModule(Long id) {
		try {
            getModuleById(id);
            moduleRepository.deleteById(id);
            return "Module deleted successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
	}
	@Override
	public Module getModuleById(Long id) {
		return moduleRepository.findById(id).orElseThrow(() -> new RuntimeException("Module not found"));
	}

	@Override
	public Module updateModule(Long id, Module module) {
		module.setId(id);
		return moduleRepository.save(module);
	}

}
