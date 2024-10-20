package com.example.timetablemanagement.service;

import java.util.List;
import com.example.timetablemanagement.entity.Module;

public interface ModuleService {

	List<Module> getModules();

    Module addModule(Module module);

    String deleteModule(Long id);

    Module getModuleById(Long id);

    Module updateModule(Long id, Module module);
}
