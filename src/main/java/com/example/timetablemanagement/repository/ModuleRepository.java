package com.example.timetablemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.timetablemanagement.entity.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

}
