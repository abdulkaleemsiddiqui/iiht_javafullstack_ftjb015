package com.examples.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringMain {

	public static void main(String[] args) {
		
		// Instantiating the container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");

		// Access bean from container
		Greetings obj = (Greetings) context.getBean("greetings");
		obj.getMessage();	

		// Graceful shutdown of container
		context.registerShutdownHook();
		
		// Release resources
		context.close();
		
	}

}
