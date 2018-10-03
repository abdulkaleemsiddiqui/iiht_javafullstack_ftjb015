package com.examples.spring.core.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.examples.spring.core.Greetings;

public class XmlBasedDepInjectionWithAppContextEx02 {

	public static void main(String[] args) {

//		Creating IoC container supplying configuration file from file system
		ApplicationContext context = new FileSystemXmlApplicationContext("src/beans-config.xml");
		
//		Retrieving the bean from container		
		Greetings obj = (Greetings) context.getBean("greetings");
		
		obj.setMessage("Instantiated ApplicationContext based IoC container supplying configuration from file system.");
		
//		Display message		
		obj.getMessage();
		
	}

}
