package com.prowings.core.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {
	
	public static void main(String[] args) {
		
		System.out.println("Main started!!!");

		ApplicationContext context = new ClassPathXmlApplicationContext("autowiringContext.xml");

		Employee e1 = context.getBean("emp", Employee.class);

		System.out.println("Employee Bean - "+e1);
		
		System.out.println("Main ended!!!");
		
	}

}
