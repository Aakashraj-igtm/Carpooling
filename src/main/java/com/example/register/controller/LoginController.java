package com.example.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.register.dao.Loginrepo;
import com.example.register.model.LoginModel;

@RestController
public class LoginController {

	@Autowired
	private Loginrepo rep;
	
	@PostMapping("/login")
	public Boolean checkUser(@RequestBody LoginModel data)
	{
		List<LoginModel> l = rep.findByEmailAndPassword(data.getEmailId(),data.getPassword());
		if(l.size() != 0)
			return true;
		return false;
	}
}