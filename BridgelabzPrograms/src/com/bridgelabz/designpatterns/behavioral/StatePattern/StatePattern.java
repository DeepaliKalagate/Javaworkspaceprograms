package com.bridgelabz.designpatterns.behavioral.StatePattern;

public class StatePattern 
{
	public static void main(String[] args) 
	{
		AlertStateContext context=new AlertStateContext();
		context.alert();
		context.alert();
		context.setState(new Silent());
		context.alert();
		context.alert();
		context.alert();
	}
}
