package com.examples.spring.core.bean;

public class GreetingServiceLocator {

	private static GreetingServiceImpl greetingService = new GreetingServiceImpl();

	public GreetingServiceLocator() {

	}

	public GreetingServiceImpl createGreetingServiceInstance() {
		return greetingService;
	}
}