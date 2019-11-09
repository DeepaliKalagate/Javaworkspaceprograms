package com.bridgelabz.designpatterns.creational.factory;

public class Server extends Computer
{
	private String ram;
	private String hd;
	private String cpu;
	public Server(String ram,String hd,String cpu)
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
