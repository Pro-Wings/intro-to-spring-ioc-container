package com.prowings.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScopes {
	
	public static void main(String[] args) {
		System.out.println("main method started!!");

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s1 = context.getBean("std1",Student.class);
		System.out.println("------>"+s1);
		System.out.println("------>"+s1.hashCode());

		Student s2 = context.getBean("std1",Student.class);
		System.out.println("------>"+s2);
		System.out.println("------>"+s2.hashCode());
		
		System.out.println("Ref equality of s1 and s2 ====> "+(s1 == s2));
		
		System.out.println("main method ended!!");
	}

}
