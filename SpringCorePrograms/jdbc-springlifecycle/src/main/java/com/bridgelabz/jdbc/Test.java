package com.bridgelabz.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao s1 = context.getBean("studentdao", StudentDao.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("1.insert\n2.Delete\n3.Display");
		try {
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				s1.insertStudent();
				break;

			case 2:
				s1.deleteStudentRecord();
				break;

			case 3:
				s1.selectAllRows();
				break;

			default:
				System.out.println("invalid input");
				break;
			}
		} catch (Exception e) {
			System.out.println("Inavalid input");
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}