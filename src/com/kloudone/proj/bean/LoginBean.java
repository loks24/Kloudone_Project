package com.kloudone.proj.bean;

import org.hibernate.validator.constraints.NotBlank;

public class LoginBean {
	@NotBlank
	private String username;
	@NotBlank
	private String password;
	
	public LoginBean(){
		super();
	}
	
	public LoginBean(String username, String password){
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDetailBean [username=" + username + ", password="
				+ password + "]";
	}
}

