package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Register;
import com.example.demo.service.registerService;

@RestController
@RequestMapping("/api/register")
public class registerController {
	
	@Autowired
	private registerService registration;
	
	
	@PostMapping
	public ResponseEntity<Register> userRegistration(@RequestBody Register register){
		System.out.println("Printing the user details : "+register);
		Register res=registration.userRegister(register);
		
		return ResponseEntity.status(201).body(res);
		
		
	}
	

}
