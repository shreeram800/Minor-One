package com.example.timetablemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.timetablemanagement.entity.NotAvailable;

public interface NotAvailableRepository extends JpaRepository<NotAvailable, Long> {

}
