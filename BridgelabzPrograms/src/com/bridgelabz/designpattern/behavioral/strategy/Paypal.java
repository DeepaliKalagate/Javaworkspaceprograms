package com.bridgelabz.designpattern.behavioral.strategy;

public class Paypal implements PaymentCard
{
	private String emailId;
	private String password;
	public Paypal(String email,String password)
	{
		this.emailId=email;
		this.password=password;
	}
	public void pay(int amount) 
	{
		System.out.println(amount+"Amount is paid using credit card...");
		
	}
}
