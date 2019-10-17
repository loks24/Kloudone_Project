package com.kloudone.proj.services;

import com.kloudone.proj.bean.LoginBean;
import com.kloudone.proj.bean.SignupBean;

public interface SignupService {
	SignupBean saveDetails(SignupBean signupbean)throws Exception;

}
