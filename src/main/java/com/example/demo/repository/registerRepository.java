package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Register;

public interface registerRepository extends JpaRepository<Register,Long>{

}
