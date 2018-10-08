package com.examples.spring.web.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.spring.web.mvc.model.Login;

/**
 * Handles requests for the Login.
 */
@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)	
	public ModelAndView login() {

		return new ModelAndView("login", "command", new Login());
	}	
	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String login() {
//		System.out.print("Login controller invoked");		
//		return "login";
//	}
	
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView authenticate(@ModelAttribute Login login) {
		
		System.out.println(login.getUserName() + " " + login.getPassword());
		
		if(login.getUserName().equalsIgnoreCase("admin") && login.getPassword().equalsIgnoreCase("admin@123"))
		{

			return new ModelAndView("success");
		}
		else
		{
			return new ModelAndView("failure");
		}	
	}
}
