package com.examples.spring.core.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example for bean instantiation with static factory method.
 */
public class BeanInstantiationStaticFactoryMethodEx {

	public static void main(String[] args) {

//		Creating IoC container supplying configuration file from classpath
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		
//		Retrieving the bean from container		
		GreetingService obj = (GreetingService) context.getBean("greetingService");
		
//		Display message			
		obj.getMessage();
		
	}

}
