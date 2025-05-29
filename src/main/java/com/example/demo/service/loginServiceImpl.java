package com.example.demo.service;

import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Login userLogin(Login userlogin) {
        return loginRepository.save(userlogin);
    }
}
