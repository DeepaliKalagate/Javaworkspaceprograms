package com.bridgelabz.designpatterns.behavioral.StatePattern;

public class Silent implements MobileAlert
{
	@Override
	public void alert() 
	{
		System.out.println("Mobile is on Silent........");
	}
	
}
