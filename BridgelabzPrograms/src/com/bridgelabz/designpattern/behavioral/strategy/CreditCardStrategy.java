package com.bridgelabz.designpattern.behavioral.strategy;

public class CreditCardStrategy implements PaymentCard
{
	private String cardNumber;
	private String cardName;
	private String cvv;
	private String dateOfExpiry;
	public CreditCardStrategy(String cNumber,String cName,String cvvNumber,String dateOfExp)
	{
		this.cardNumber=cNumber;
		this.cardName=cName;
		this.cvv=cvvNumber;
		this.dateOfExpiry=dateOfExp;
	}
	@Override
	public void pay(int amount) 
	{
		System.out.println(amount+"Amount is paid...");
		
	}
	
}
