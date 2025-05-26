package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/login")
public class loginController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public ResponseEntity<Login> login(@RequestBody Login u) {

        Login l1 = loginService.userLogin(u);
        return ResponseEntity.status(201).body(l1);
    }
    
    
}


