package com.examples.spring.core.bean;

public class GreetingServiceImpl {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {

		System.out.println("Your Message : " + message);
	}
}