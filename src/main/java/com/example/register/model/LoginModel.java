package com.example.register.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginModel {
	@Id
	private String id;
	private String emailId;
	private String password;
	public LoginModel(String id,String emailId, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
	}
	public LoginModel() {
		super();
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return this.id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
