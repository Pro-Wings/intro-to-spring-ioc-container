package com.prowings.core.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircularDependency {
	
	public static void main(String[] args) {
		System.out.println("main started");
		ApplicationContext context = new ClassPathXmlApplicationContext("circularDependecyContext.xml");

//		Order order  = context.getBean(Order.class);
		
		System.out.println("main ended");
		
		
	}

}
