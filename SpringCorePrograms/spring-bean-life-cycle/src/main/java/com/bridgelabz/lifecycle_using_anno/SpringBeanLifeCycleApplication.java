package com.bridgelabz.lifecycle_using_anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnoBeans.xml");
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
		context.close();
	}

}
