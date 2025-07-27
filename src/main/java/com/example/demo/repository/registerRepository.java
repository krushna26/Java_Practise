package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.userDetails;

public interface registerRepository extends JpaRepository<userDetails,Long>{

}
