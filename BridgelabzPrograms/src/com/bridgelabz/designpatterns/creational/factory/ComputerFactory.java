package com.bridgelabz.designpatterns.creational.factory;

public class ComputerFactory 
{
	public static Computer getComputer(String type,String ram,String hd,String cpu)
	{
		if("Pc".equals(type))
			return new Pc(ram,hd,cpu);
		else if("Server".equalsIgnoreCase(type))
			return new Server(ram,hd,cpu);
		return null;
	}
}
