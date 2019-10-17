package com.kloudone.proj.bean;

import org.hibernate.validator.constraints.NotBlank;

public class SignupBean {
	@NotBlank
	private String username;
	@NotBlank
	private String password;
	
	public SignupBean(){
		super();
	}
	
	public SignupBean(String username, String password){
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
