package com.kloudone.proj.dao;

import com.kloudone.proj.entity.LoginEntity;

public interface LoginDAO {
	
	public LoginEntity findLoginDetails(String username);

}
