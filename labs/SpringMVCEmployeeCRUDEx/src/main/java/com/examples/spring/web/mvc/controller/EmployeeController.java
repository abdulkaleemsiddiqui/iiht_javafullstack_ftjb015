package com.examples.spring.web.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.spring.web.mvc.model.Employee;
import com.examples.spring.web.mvc.service.EmployeeService;

/**
 * Handles requests for the Login.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	private static Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	@Qualifier("employeeValidator")
	private Validator validator;	
	
	@Autowired
	EmployeeService empService;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}	
	
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
	
	@PostMapping
	public String addEmployee(@ModelAttribute Employee employee, BindingResult bindingResult)
	{
		validator.validate(employee, bindingResult);
		
		if (bindingResult.hasErrors()) {
			return "addEmployee";
		}		
		
		log.info("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Country: " + employee.getCountry());
		empService.add(employee);
		return "redirect:/employee/list";
	}
	
	@GetMapping("/list")
	public ModelAndView listEmployees(Model model)
	{
		List<Employee> empList = empService.list();
		log.info(empList.toString());
		return new ModelAndView("listEmployee", "empList", empList);
	}
}
