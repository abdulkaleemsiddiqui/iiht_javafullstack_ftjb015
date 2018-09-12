package com.examples.java.core;

import java.util.Date;

import com.examples.java.domain.Greeting;

public class HelloWorld
{
	private static int a = 10;
	
	public static void main(String[] args) throws InterruptedException
	{
		//System.out.println("Hello World! ");
		
		// Declaration
		// Instantiation / Construction 
		// Initiazation
		Greeting greeting = new Greeting();
		
		System.out.println(greeting.getMessage() + " " + new Date());
		
		// Data Types -> byte, short, int, long, float, double, char, String, boolean
		
		byte a = -128;  // 8 bits - 1 byte -> 2^1 // Byte
		short b = 254; // 2 bytes
		int c = 66000; // 4 bytes
		long d = 10000; // 8 bytes
		
		float f = 10.5f; // 4 bytes
		double g = 1000.5999; //8 bytes
		char e = 'a';  
		
		boolean flag = true;	// 1 bit
		
		String test = "Hello World";
		String test1 = "Hello World";
		
		System.out.println((a < b) ? "a is greater than b" : "b is greater than a");
		System.out.println(b); 
	
		// Variable Types -> Constant vs Variable
		// Primitive variables
		// Reference variables
		
		// Arithmatic operators: +, -, *, /, %, etc..
		// Relational operators: >, ==, <, <=, !=, etc.
		// Logical operations: ||, &&, !, etc.
		// Bitwise operators: &, <<<, >>>
		// Assignment operators: =
		// Conditional operator: (expr)?true:false
		// InstanceOf
		
		// Array -> store the data sequentially
		int[] numbers = new int[10];  // -> 4 * 10 -> 40 bytes mem alloted
	
		Greeting[] greetingList = new Greeting[5];
		
		
		int[] nos = new int[]{10, 50, 40};
		
		// Loop control
		// while
		int index = 0;
		while(index < nos.length)
		{
			System.out.println(nos[index]);
			index++;
		}
		
		System.out.println();
		index = 0;
		// do while
		do
		{
			System.out.println(nos[index]);
			index++;
		}
		while(index < nos.length);
		
		// for
		System.out.println();
		for(int i = 0; i < nos.length; i++)
		{		
				
				switch (i) {
				case 0:
					System.out.println(nos[i]);
					break;

				default:
					break;
				}

		}
		
		System.out.println();
		// for each
		for(int item: nos)
		{
			System.out.println(item);

		}
		
		//Decision Structure
		
	}
}

