package com.prowings.core.custombeanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycleMethods {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("CustomBeanLifeCycle.xml");
		
		context.registerShutdownHook(); //when JVM is getting shutdown, then shutdowns container as well
		
//    	context.close(); //explicitly shutdown container
    	
    	System.out.println("main ended!!");
		
	}

}
