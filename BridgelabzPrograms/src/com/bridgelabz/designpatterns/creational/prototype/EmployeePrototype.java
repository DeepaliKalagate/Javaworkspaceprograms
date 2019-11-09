package com.bridgelabz.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeePrototype implements Cloneable
{
	List<String> empList;
	public EmployeePrototype()
	{
		empList=new ArrayList<String>();
	}
	public EmployeePrototype(List<String> list)
	{
		this.empList=list;
	}
	public void loadData()
	{
		empList.add("Lokesh");
		empList.add("Deepali");
		empList.add("Anvika");
		empList.add("Guru");
	}
	public List<String> getEmpList()
	{
		return empList;
	}
	public Object clone() throws CloneNotSupportedException
	{
		List<String> temp=new ArrayList<String>();
		for(String s:this.empList)
		{
			temp.add(s);
		}
		return new EmployeePrototype(temp);	
	}
}
