package com.kloudone.proj.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kloudone.proj.bean.LoginBean;
import com.kloudone.proj.bean.SignupBean;
import com.kloudone.proj.services.LoginService;
import com.kloudone.proj.services.SignupService;

@Controller
public class LoginController {
	
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private SignupService signupservice;

	@RequestMapping(value = "login.html", method = RequestMethod.GET)
	public ModelAndView login() {
		
		LoginBean loginBean = new LoginBean();
		ModelAndView modelAndView = new ModelAndView("login", "loginBean", loginBean);
			
		return modelAndView;
	}
	@RequestMapping(value="signup.html",method = RequestMethod.GET)
	public ModelAndView signup() {
		SignupBean signupbean=new SignupBean();
		ModelAndView modelandview=new ModelAndView("signup","signupbean",signupbean);
		return modelandview;
	}
	@RequestMapping(value = "validateLogin.html", method = RequestMethod.POST)
	public ModelAndView validateLogin(@ModelAttribute @Valid LoginBean loginBean, BindingResult result) throws Exception {		
			

		ModelAndView modelAndView = new ModelAndView();
		String pageName = "";
		if (result.hasErrors()) {
			pageName = "login";
		} else {
			
			LoginBean login = loginService.validateLogin(loginBean.getUsername());			
			if(login!= null && loginBean.getPassword().equals(login.getPassword())){
				pageName = "Welcome";
			}
			else {
				modelAndView.addObject("message", "Either Username or Password is incorrect. Please enter credentials again.");
				pageName = "login";
			}
		}
		modelAndView.setViewName(pageName);	
		
		return modelAndView;
	}
	@RequestMapping(value="addDetails.html",method =RequestMethod.POST)
	public ModelAndView addDetails(@ModelAttribute @Valid SignupBean signupbean,BindingResult result)throws Exception
	{
		ModelAndView modelandview =new ModelAndView();
		SignupBean signupbean1=signupservice.saveDetails(signupbean);
		modelandview.setViewName("registered");
		modelandview.addObject("message","Registered Successfully");
		return modelandview;
		
	}

}
