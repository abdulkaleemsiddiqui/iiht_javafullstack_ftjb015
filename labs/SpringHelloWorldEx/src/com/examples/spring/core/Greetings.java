package com.examples.spring.core;

public class Greetings {
	private String message = "Hello World!";
	
	private static Greetings greetings;
	
	private Greetings()
	{
		
	}

//	public Greetings(String message)
//	{
//		this.message = message;
//	}
//	
//	public Greetings(String message, String name)
//	{
//		this.message = message + " " + name;
//	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
//	public static Greetings getGreetings()
//	{
//		if(greetings == null)
//		{
//			greetings = new Greetings();	
//		}
//		return greetings;
//	}
}
