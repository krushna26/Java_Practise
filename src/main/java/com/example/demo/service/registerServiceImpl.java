package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Register;
import com.example.demo.repository.registerRepository;

@Service
public class registerServiceImpl implements registerService {
	@Autowired
	private registerRepository regRepository;
	
	@Override
	public Register userRegister(Register register) {
		Register res=regRepository.save(register);
		return res;
	}
	

}
