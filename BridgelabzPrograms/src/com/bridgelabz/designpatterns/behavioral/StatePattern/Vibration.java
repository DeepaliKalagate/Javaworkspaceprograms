package com.bridgelabz.designpatterns.behavioral.StatePattern;

public class Vibration implements MobileAlert
{

	@Override
	public void alert()
	{
		System.out.println("Mobile is on Vibration........");
		
	}
	
}
