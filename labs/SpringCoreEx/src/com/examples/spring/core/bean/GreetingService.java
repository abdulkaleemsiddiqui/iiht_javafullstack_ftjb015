package com.examples.spring.core.bean;

public class GreetingService {

	private static GreetingService greetingsService = new GreetingService();
	private String message;

	private GreetingService() {

	}

	public static GreetingService createInstance(String message) {
		greetingsService.setMessage(message);
		return greetingsService;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {

		System.out.println("Your Message : " + message);
	}
}