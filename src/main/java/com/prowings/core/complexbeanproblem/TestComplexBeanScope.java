package com.prowings.core.complexbeanproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComplexBeanScope {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("complexBeanScopeContext.xml");

		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);
		Employee e2 = context.getBean("emp1", Employee.class);
		System.out.println(e2);
		
		System.out.println(e1 == e2); //ref eq employee
		
		System.out.println(e1.getAddress() == e2.getAddress()); //ref eq address

		
		System.out.println("main ended!!");
		
	}

}
