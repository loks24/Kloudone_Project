package com.kloudone.proj.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kloudone.proj.bean.LoginBean;
import com.kloudone.proj.bean.SignupBean;
import com.kloudone.proj.dao.LoginDAO;
import com.kloudone.proj.dao.SignupDAO;
import com.kloudone.proj.entity.LoginEntity;

@Service
public class SignupServiceImpl implements SignupService{
	
	@Autowired
	SignupDAO signupdao;

	@Override
	public SignupBean saveDetails(SignupBean signupbean) throws Exception {
		// TODO Auto-generated method stub
		LoginEntity loginentity =new LoginEntity();
		BeanUtils.copyProperties(signupbean, loginentity);
		loginentity=signupdao.saveDetails(loginentity);
		return signupbean;
	}

}
