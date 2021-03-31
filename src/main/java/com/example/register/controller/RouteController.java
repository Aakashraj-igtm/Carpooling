package com.example.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.register.dao.Routerepo;
import com.example.register.model.RouteModel;


@RestController
public class RouteController {
	@Autowired
	Routerepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@PostMapping("/addroute")
   public Boolean addroute(@RequestBody RouteModel r) {
		System.out.println(r.toString());
		repo.save(r);
	   return true;
   }
}