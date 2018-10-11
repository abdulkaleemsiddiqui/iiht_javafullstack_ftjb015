package com.examples.spring.web.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.spring.web.mvc.model.Employee;

/**
 * Handles requests for the Login.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@ModelAttribute("employee")
	public Employee createEmployeeModel()
	{
		return new Employee();
	}
	
	@ModelAttribute("countries")
	public List<String> getCountries() {
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Australia");
		return countries;
	}	
	
	@GetMapping
	public ModelAndView showAddForm() {

		return new ModelAndView("addEmployee");
	}
}
