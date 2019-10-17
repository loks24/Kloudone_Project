package com.kloudone.proj.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kloudone.proj.bean.LoginBean;
import com.kloudone.proj.dao.LoginDAO;
import com.kloudone.proj.entity.LoginEntity;


@Service
public class LoginServiceImpl implements LoginService {


	@Autowired
	private LoginDAO loginDAO;	

	@Override
	public LoginBean validateLogin(String username) {
		LoginBean loginBean = new LoginBean();
		LoginEntity loginEntity = loginDAO.findLoginDetails(username);
		if (loginEntity != null) {
			BeanUtils.copyProperties(loginEntity, loginBean);
		}
		return loginBean;
	}

}