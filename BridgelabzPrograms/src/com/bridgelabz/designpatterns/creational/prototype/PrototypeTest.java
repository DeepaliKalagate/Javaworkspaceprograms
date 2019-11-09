/*  Purpose: Prototype Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 21-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.creational.prototype;

import java.util.List;

public class PrototypeTest 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		EmployeePrototype emp=new EmployeePrototype();
		emp.loadData();
		EmployeePrototype emp1=(EmployeePrototype)emp.clone();
		EmployeePrototype emp2=(EmployeePrototype)emp.clone();
		List<String> list=emp1.getEmpList();
		list.add("Anuja");
		List<String> list1=emp2.getEmpList();
		list1.remove("Anvika");
		System.out.println("Employee : "+emp.getEmpList());
		System.out.println("Employee 1 : "+list);
		System.out.println("Employee 2 : "+list1);
	}
}
