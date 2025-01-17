package com.prowings.core.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependsOn {
	
	public static void main(String[] args) {
		System.out.println("main started");
		ApplicationContext context = new ClassPathXmlApplicationContext("dependsOnContext.xml");
		
		A a = context.getBean(A.class);
		System.out.println(a);

		B b = context.getBean(B.class);
		System.out.println(b);

		C c = context.getBean(C.class);
		System.out.println(c);
		
		System.out.println("main ended");
		
		
	}

}
