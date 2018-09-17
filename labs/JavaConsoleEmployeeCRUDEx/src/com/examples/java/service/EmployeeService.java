package com.examples.java.service;

import java.util.ArrayList;
import java.util.List;

import com.examples.java.model.Employee;

public class EmployeeService {

	List employees = new ArrayList();

	public boolean add(Employee employee) {
		return employees.add(employee);
	}

	public Employee get(int id) {
		Employee employee = null;
		for (Object item : employees) {
			employee = (Employee) item;
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}

	public List getAll() {
		return employees;
	}

	public boolean update(Employee employee) {
		boolean isUpdateSuccess = false;
		for (Object item : employees) {
			if (((Employee) item).getId() == employee.getId()) {
				employees.remove(employee);
				isUpdateSuccess = employees.add(employee);
				break;
			}
		}
		return isUpdateSuccess;
	}

	public boolean delete(Employee emp) {
		return employees.remove(emp);
	}

}
