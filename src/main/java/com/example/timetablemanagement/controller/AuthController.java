package com.example.timetablemanagement.controller;

import com.example.timetablemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.example.timetablemanagement.dto.AuthRequest;
import com.example.timetablemanagement.dto.AuthResponse;
import com.example.timetablemanagement.service.AuthService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
	
	private final AuthService authService;
	
    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest) {
        log.info("AuthController.login()...");
        return authService.login(authRequest.getUsername(), authRequest.getPassword());
    }
    
    
    @GetMapping("/logout/{id}")
    public void logout(@PathVariable Long id) {
        log.info("AuthController.logout()...");
        authService.logout(id);
    }

//	@PostMapping("/signup")
//	public ResponseEntity<User> signUp(@RequestBody SignUpRequest req) throws Exception{
//		return ResponseEntity.ok(authService.signUp(req));
//		
//	}
//	@PostMapping("/signin")
//	public ResponseEntity<AuthResponse> signIn(@RequestBody SignInRequest req){
//		return ResponseEntity.ok(authService.signIn(req));
//	}

}
