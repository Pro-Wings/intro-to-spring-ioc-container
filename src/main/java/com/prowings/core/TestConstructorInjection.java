package com.prowings.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjection {
	
	public static void main(String[] args) {
		System.out.println("main started!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person p = context.getBean("p1", Person.class);
		System.out.println("Person p1 = "+p);
		System.out.println("main ended!!");
		
		
		
	}

}
