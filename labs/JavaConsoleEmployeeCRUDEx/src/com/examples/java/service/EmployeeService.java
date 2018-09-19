package com.examples.java.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.examples.java.model.Employee;

public class EmployeeService {

	List<Employee> employees = new ArrayList<Employee>();

	public boolean add(Employee employee) {
		return employees.add(employee);
	}

	public Employee get(int id) {
		//Employee employee = null;
		
//		for (Employee employee : employees) {
//			if (employee.getId() == id) {
//				return employee;
//			}			
//		}
//		
		return employees.stream().filter(emp -> emp.getId() == id).findFirst().get();
	}

	public List<Employee> getAll() {
		return employees;
	}

	public boolean update(Employee employee) {
		boolean isUpdateSuccess = false;
		
		for (Employee emp : employees) {
			if(emp.getId() == employee.getId())
			{
				employees.remove(employee);
				isUpdateSuccess = employees.add(employee);
				break;
			}
		}		
		
//		for (Object item : employees) {
//			if (((Employee) item).getId() == employee.getId()) {
//				employees.remove(employee);
//				isUpdateSuccess = employees.add(employee);
//				break;
//			}
//		}
		return isUpdateSuccess;
	}

	public boolean delete(Employee emp) {
		return employees.remove(emp);
	}
	
	public long getEmployeeCountAgeGreaterThan40()
	{
		return employees.stream().filter(emp -> emp.getAge() > 40).count();
	}
}
