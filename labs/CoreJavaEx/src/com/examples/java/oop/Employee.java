package com.examples.java.oop;

public class Employee extends Person implements Appraisal {
	int empId;
	String department;
	double salary;

	public Employee(String name, int age, String gender, int empId, String department, double salary) {
		super(name, age, gender);
		this.empId = empId;
		this.department = department;
		this.salary = salary;
	}

	public void printDetails() {
		// print employee details
		super.printDetails();
		System.out.println("EmpId: " + empId);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
	}

	@Override
	public void appraise() {
		System.out.println("Appraial performed");
	}

	// // overloaded method
	// printDetails(Sring printMode)
	// {
	// // print employee details
	// }

}
