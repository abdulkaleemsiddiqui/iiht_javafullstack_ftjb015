package com.examples.spring.web.mvc.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.examples.spring.web.mvc.model.Employee;

@Service
public class EmployeeService {
	
	private static Map<Integer, Employee> employees = new LinkedHashMap<Integer, Employee>();
	

	public void add(Employee employee)
	{

		employee.setId(employees.size() + 1);		
			
		employees.put(employee.getId(), employee);
		System.out.println("Employee Added - " + employee.getId());
	}
	
	public void update(Employee employee)
	{
		
		employees.put(employee.getId(), employee);
	}
	
	public Employee get(String empId)
	{
		return employees.get(empId);
	}
	
	public void delete(String empId)
	{
		employees.remove(empId);
	}	
	
	public List<Employee> list()
	{
		return new ArrayList<Employee>(employees.values());
	}	
	
}
