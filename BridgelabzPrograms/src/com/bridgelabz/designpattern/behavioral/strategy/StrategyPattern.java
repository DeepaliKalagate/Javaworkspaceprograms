package com.bridgelabz.designpattern.behavioral.strategy;

public class StrategyPattern 
{
	public static void main(String[] args) 
	{
		ShoppingCart cart=new ShoppingCart();
		Item item1=new Item("123",1000);
		Item item2=new Item("12345",2000);
		
		cart.addItem(item1);
		cart.addItem(item2);
		cart.pay(new Paypal("abc@123","lokesh"));
		cart.pay(new CreditCardStrategy("123445","Deepali","304","15/12/2050"));

	}

}
