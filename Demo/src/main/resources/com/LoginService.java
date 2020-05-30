package com;


public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("asd") && password.equals("123");
	}

}