package com.example.register.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.register.model.EmployeesModel;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeesModel, String>{

	@Query("from EmployeesModel where employeeId = ?1")
	public EmployeesModel findByEmployeeId(String id);

	public void deleteById(String id);

	
}
