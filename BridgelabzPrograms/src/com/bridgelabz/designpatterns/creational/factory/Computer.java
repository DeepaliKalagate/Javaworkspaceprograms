package com.bridgelabz.designpatterns.creational.factory;

public abstract class Computer
{
	public abstract String getRAM();
	public abstract String getHD();
	public abstract String getCPU();
	@Override
	public String toString() 
	{
		return "Computer RAM=" + getRAM() + ", HD=" + getHD() + ", CPU=" + getCPU() ;
	}
}
