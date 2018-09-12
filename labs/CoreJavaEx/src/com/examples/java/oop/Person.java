package com.examples.java.oop;

public abstract class Person
{
   private String name;
   private int age;
   private String gender;
   
   public Person()
   {
	   
   }
   
   public Person(String name, int age, String gender)
   {
	   this.name = name;
	   this.age = age;
	   this.gender = gender;
   }
   
   public void printDetails()
	{
	  // prints person details
	   System.out.println("Name: " + name);
	   System.out.println("Age: " + age);
	   System.out.println("Gender: " + gender);
	}   
}
