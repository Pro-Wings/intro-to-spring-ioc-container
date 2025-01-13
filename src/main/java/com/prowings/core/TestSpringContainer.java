package com.prowings.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSpringContainer {
	
	public static void main(String[] args) {
		
//		Student std1 = new Student();
//		std1.setRollNumber(10);
//		std1.setName("Ram");
//		std1.setAddress("Pune");
//		System.out.println(std1);

//		Resource resource = new ClassPathResource("applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Student s2 = factory.getBean(Student.class);
//		System.out.println("BeanFactory bean :"+s2);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student s1 = context.getBean(Student.class);
		System.out.println("ApplicationContext bean :"+s1);

		Student s2 = context.getBean(Student.class);
		System.out.println("ApplicationContext bean :"+s1);

		
		System.out.println(s1 == s2);
		
		Employee e1 = context.getBean(Employee.class);
		System.out.println("ApplicationContext 2 bean :"+e1);
	}

}
