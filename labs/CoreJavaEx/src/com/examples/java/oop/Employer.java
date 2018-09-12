package com.examples.java.oop;

public class Employer extends Person
{
    String companyName;
	String location;
	double revenue;
	
   public void printDetails()
	{
	  // print employer details
 	   System.out.println("CompanyName: " + companyName);
 	   System.out.println("Location: " + location);
 	   System.out.println("Revenue: " + revenue);    	   
	} 	
}