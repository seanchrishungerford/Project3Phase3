package com.junitexample.model;

import lombok.Builder;
import lombok.Getter;


//User POJO class
@Getter
@Builder
public class User {
	
	private String userName;
	
	private String password;
	
	private String role;

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}


}
