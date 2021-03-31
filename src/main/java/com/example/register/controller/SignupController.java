package com.example.register.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.register.dao.CustomerRepo;
import com.example.register.dao.Loginrepo;
import com.example.register.model.CustomerModel;
import com.example.register.model.LoginModel;


@RestController
class SignupController {
	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	private Loginrepo log;
	
	@PostMapping("/signup")
	public Boolean saveCustomer(@RequestBody CustomerModel c)
	{
		try {
			repo.save(c);
			LoginModel l = new LoginModel(c.getCustomerId(),c.getEmailId(),c.getPassword());
			log.save(l);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}