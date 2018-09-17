package com.examples.java.exception;

public class CustomFileException extends Exception 
{
	public CustomFileException()
	{
		super();
	}
	
	public CustomFileException(String message)
	{
		super(message);
	}
}
