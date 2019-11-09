package com.bridgelabz.designpatterns.structural.adapter;

public class SocketObjectAdapter implements SocketAdapter
{
	private Socket socket=new Socket();
	public Volt get120Volt() 
	{
		return socket.getVolt();
	}
	public Volt get12volt()
	{
		Volt v=socket.getVolt();
		return convertVolt(v,10);
	}
	public Volt get3volt() 
	{
		Volt v=socket.getVolt();
		return convertVolt(v, 40);
	}
	private Volt convertVolt(Volt v, int i) 
	{
		return new Volt(v.getVolt()/i);
	}
}
