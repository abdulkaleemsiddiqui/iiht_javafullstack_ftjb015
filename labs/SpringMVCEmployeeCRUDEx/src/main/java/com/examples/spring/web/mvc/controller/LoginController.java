package com.examples.spring.web.mvc.controller;

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
	
	@ModelAttribute("login")
	public Login createLoginModel()
	{
		return new Login();
	}

	@RequestMapping(name = "loginMapping", value = "/login", method = RequestMethod.GET )
	public ModelAndView login() {

		// Controller Returns...
		// String - Logical view name
		// View Object - implements View interface
		// ModelAndView - consists for logical view name and model

		return new ModelAndView("login");
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView authenticate(@ModelAttribute Login login, Model model) {

		if (login.getUserName().equalsIgnoreCase("admin") && login.getPassword().equalsIgnoreCase("admin@123")) {

			//return new ModelAndView("success");
			return new ModelAndView("redirect:/employee");
		} else {
			return new ModelAndView("failure");
		}
	}
}
