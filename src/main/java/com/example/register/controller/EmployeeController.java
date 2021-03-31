package com.example.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.register.dao.EmployeeRepo;

import com.example.register.model.EmployeesModel;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class EmployeeController {
	@Autowired
	private EmployeeRepo emp;
	
	@PostMapping("/saveEmployee")
	public Boolean saveEmployee(@RequestBody
			EmployeesModel data)
	{
		try {
			emp.save(data);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	@GetMapping("/getEmployee")
	public List<EmployeesModel> getEmployee()
	{
		List<EmployeesModel> l = emp.findAll();
		return l;
	}
	
	@GetMapping("/getEmployee/{id}")
	public List<EmployeesModel> getEmployeeById(@PathVariable String id)
	{
		EmployeesModel e = emp.findByEmployeeId(id);
		List<EmployeesModel> l = new ArrayList<>();
		l.add(e);
		return l;
	}
	
	@PutMapping("/editEmployee/{employeeId}")
	public EmployeesModel editEmployee(@RequestBody  EmployeesModel data,@PathVariable("employeeId") String id)
	{	
		emp.deleteById(id);
		data.setEmployeeId(id);
		emp.save(data);
		System.out.println(data.toString());
		return data;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteEmployee(@PathVariable String id)
	{
		try {
			emp.deleteById(id);
			return true;
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
			return false;
		}
	}
}