package com.harsha;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class DemoSpring {
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public ModelAndView addSignUpDetails(HttpServletRequest request,ModelMap modelMap)
	{
		String name=request.getParameter("userName");
		String pass=request.getParameter("password");
		String email=request.getParameter("email");
		
		SignUpBean signUpBean = new SignUpBean();
		
		signUpBean.setUserName(name);
		signUpBean.setPassword(pass);
		signUpBean.setEmail(email);
		System.out.println("working");
		return new ModelAndView("hellopage");
	}
}
