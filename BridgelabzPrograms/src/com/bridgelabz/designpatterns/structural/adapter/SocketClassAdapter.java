package com.bridgelabz.designpatterns.structural.adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter
{
	public Volt get120Volt() 
	{
		return getVolt();
	}
	public Volt get12volt() 
	{
		Volt v=getVolt();
		return convertVolt(v,10);
	}	
	public Volt get3volt() 
	{
		Volt v=getVolt();
		return convertVolt(v, 40);
	}
	private Volt convertVolt(Volt v, int i) 
	{
		return new  Volt(v.getVolt()/i);
	}
}
