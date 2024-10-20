package com.example.timetablemanagement.service;

import com.example.timetablemanagement.dto.AuthResponse;

public interface AuthService {
    AuthResponse login(String login, String password);
    void logout(Long id);
}
