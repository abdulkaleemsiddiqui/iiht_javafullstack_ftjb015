package com.examples.java.oop;

public class EmployeeMain {
	
	public static void main(String[] args)
	{
		Person employee = new Employee("Anand", 35, "Male", 100, "IT", 10000);
		Person employer = new Employer();
		
		employee.printDetails();
		System.out.println();
		employer.printDetails();
		
		Appraisal emp = new Employee("Anand", 35, "Male", 100, "IT", 10000);
		emp.appraise();
		
		System.out.println();		
		Employee emp1 = new Employee("Anand", 35, "Male", 100, "IT", 10000);
		emp1.printDetails();
		emp1.appraise();		
		
	}

}
