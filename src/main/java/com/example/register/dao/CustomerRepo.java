package com.example.register.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.register.model.CustomerModel;

public interface CustomerRepo extends JpaRepository<CustomerModel,String>{

}