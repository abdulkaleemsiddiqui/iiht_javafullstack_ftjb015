package com.examples.spring.core.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.spring.core.Greetings;

public class JavaConfigBasedDepedencyInjectionEx {

	public static void main(String[] args) {
		// Assemble the objects
		ApplicationContext context = new AnnotationConfigApplicationContext(GreetingsConfig.class);

		Greetings obj = (Greetings) context.getBean("greetings");
		
		obj.getMessage();

	}
}
