package com.examples.spring.core.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigBasedDepedencyInjectionEx2 {

	public static void main(String[] args) {
		// Assemble the objects
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfiguration.class);

		Customer obj = (Customer) context.getBean("customer");

		System.out.println(
				obj.getPerson().getName() + " " + obj.getPerson().getAge() + " " + obj.getPerson().getLocation());

	}
}
