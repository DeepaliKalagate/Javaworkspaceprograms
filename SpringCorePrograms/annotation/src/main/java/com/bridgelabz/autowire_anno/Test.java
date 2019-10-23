package com.bridgelabz.autowire_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.require_anno.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiredBean.xml");
		Employee e1 = context.getBean("employee", Employee.class);
		System.out.println(e1);
		((AbstractApplicationContext) context).close();

	}

}