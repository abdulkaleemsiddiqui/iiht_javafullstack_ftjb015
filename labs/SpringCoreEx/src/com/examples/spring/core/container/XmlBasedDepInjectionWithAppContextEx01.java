package com.examples.spring.core.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.spring.core.Greetings;

public class XmlBasedDepInjectionWithAppContextEx01 {

	public static void main(String[] args) {

//		Creating IoC container supplying configuration file from classpath
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		
//		Retrieving the bean from container		
		Greetings obj = (Greetings) context.getBean("greetings");
		
		obj.setMessage("Instantiated ApplicationContext container supplying configuration from classpath.");
		
//		Display message			
		obj.getMessage();
		
	}

}
