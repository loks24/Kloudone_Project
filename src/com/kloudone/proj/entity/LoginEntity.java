package com.kloudone.proj.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "logindetail")
public class LoginEntity {
	
	@Id
	private String username;
	private String password;
	
	public LoginEntity(){
		super();
	}
	
	public LoginEntity(String username, String password){
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
		return "LoginDetailEntity [username=" + username + ", password="
				+ password + "]";
	}


}
