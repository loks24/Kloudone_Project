package com.kloudone.proj.dao;

import com.kloudone.proj.entity.LoginEntity;

public interface SignupDAO {
	public LoginEntity saveDetails(LoginEntity loginentiry)throws Exception;

}
