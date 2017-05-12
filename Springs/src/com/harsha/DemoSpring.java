package com.harsha;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class DemoSpring {

	@RequestMapping(value= "/hellopage" ,method=RequestMethod.POST)
	public ModelAndView addSignUpDetails(HttpServletRequest request,ModelMap modelMap)
	{
		String name=request.getParameter("userName");
		SignUpBean signUpBean = new SignUpBean();
		signUpBean.setUserName(name);
		return new ModelAndView("hellopage","name",signUpBean.getUserName());
	}
}
