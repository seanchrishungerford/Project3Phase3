package com.junitexample;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import com.junitexample.model.User;

public class Authentication {
	
	//Create Set of Users (hash set)
	public static Set<User> userList = new HashSet<>();
	//User is logged out by default
	private User currentSessionUser = null;
	//Authenticate user:
	public Boolean login(String userName, String password) {
		AtomicBoolean userExists = new AtomicBoolean(false);

		userList.stream().filter(x -> x.getUserName().equals(userName) && x.getPassword().equals(password)).findFirst()
				.ifPresent(x -> {
					userExists.set(true);
					currentSessionUser = x;
				});

		return userExists.get();
	}
	//Get user role
	public String getRole() {
		// TODO Auto-generated method stub
		if (currentSessionUser != null) {
			return currentSessionUser.getRole();
		}
		return null;
	}
	//Get User name
	public String getUserName() {
		// TODO Auto-generated method stub
		if (currentSessionUser != null) {
			return currentSessionUser.getUserName();
		}
		return null;
	}

	//logout
	public void logout() {
		currentSessionUser = null;
	}

}
