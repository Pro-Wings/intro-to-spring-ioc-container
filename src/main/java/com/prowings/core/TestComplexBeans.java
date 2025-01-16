package com.prowings.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComplexBeans {
	
	public static void main(String[] args) {
		System.out.println("main started!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Car car = context.getBean("car1", Car.class);
		
		System.out.println("Retrieved Car from Container : "+ car);
		
		System.out.println("main ended!!");
	}

}
