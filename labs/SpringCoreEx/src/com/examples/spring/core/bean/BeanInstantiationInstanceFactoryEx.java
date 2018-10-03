package com.examples.spring.core.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example for bean instantiation with instance factory method.
 */
public class BeanInstantiationInstanceFactoryEx {

	public static void main(String[] args) {

//		Creating IoC container supplying configuration file from classpath
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		
//		Retrieving the bean from container		
		GreetingServiceImpl obj = (GreetingServiceImpl) context.getBean("greetingService1");
		
//		Display message			
		obj.getMessage();
		
	}

}
