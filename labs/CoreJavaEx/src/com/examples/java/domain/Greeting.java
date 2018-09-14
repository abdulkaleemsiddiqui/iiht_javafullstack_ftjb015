package com.examples.java.domain;
public class Greeting
{
	public String message;
	
	public Greeting()
	{
		this.message = "Hello World";
	}
	
	public Greeting(String message)
	{
		this.message = message;
	}	
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return this.message;
	}
}