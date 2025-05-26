package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class loginServiceImpl implements LoginService {
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Login userLogin(Login login) {
		// TODO Auto-generated method stub
		Login l=loginRepository.save(login);
		return l;
	}

}
