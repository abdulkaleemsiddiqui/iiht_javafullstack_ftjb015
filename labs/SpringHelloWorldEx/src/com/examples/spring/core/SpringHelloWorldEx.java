package com.examples.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringHelloWorldEx {

	public static void main(String[] args) {
		
//		Greetings greetings = Greetings.getGreetings();
//		
//		System.out.println(greetings.getMessage());
		
//		DefaultServiceLocator locator = new DefaultServiceLocator();
//		System.out.println(locator.createGreetingService().getMessage());
//		System.out.println(locator.createAccountService().getMessage());
		
		// Creating IoC Container
//		BeanFactory context = new XmlBeanFactory(new ClassPathResource("beans-config.xml"));		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");		
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/beans-config.xml");
		Greetings greetings = (Greetings) context.getBean("greetings");
		System.out.println(greetings.getMessage());
		
//		GreetingService greetingService = (GreetingService) context.getBean("greetingService");
//		AccountService accountService = (AccountService) context.getBean("accountService");
//		System.out.println(context.getBeanDefinitionCount());
//		System.out.println(greetingService.getMessage());
//		System.out.println(accountService.getMessage());
	}

}
