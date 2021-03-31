package com.example.register.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.register.model.LoginModel;

@Repository
public interface Loginrepo  extends JpaRepository<LoginModel,String>{

	@Query("from LoginModel where emailId = ?1 and password = ?2")
	List<LoginModel> findByEmailAndPassword(String emailId, String password);

}