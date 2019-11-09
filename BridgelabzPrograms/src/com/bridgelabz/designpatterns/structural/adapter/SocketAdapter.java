package com.bridgelabz.designpatterns.structural.adapter;

public interface SocketAdapter
{
	public Volt get120Volt();
	public Volt get12volt();
	public Volt get3volt();
}
