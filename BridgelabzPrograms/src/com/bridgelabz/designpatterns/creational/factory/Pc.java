package com.bridgelabz.designpatterns.creational.factory;

public class Pc extends Computer
{
	String ram;
	String hd;
	String cpu;
	public Pc(String ram,String hd,String cpu)
	{
		this.ram=ram;
		this.hd=hd;
		this.cpu=cpu;
	}
	public String getRAM() 
	{
		return this.ram;
	}
	
	public String getHD() 
	{
		return this.hd;
	}
	
	public String getCPU() 
	{
		return this.cpu;
	}
}
