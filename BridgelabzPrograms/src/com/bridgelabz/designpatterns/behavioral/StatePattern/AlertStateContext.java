package com.bridgelabz.designpatterns.behavioral.StatePattern;

public class AlertStateContext implements MobileAlert
{
	private MobileAlert currentState;

	public AlertStateContext()
	{
		this.currentState=(MobileAlert) new Vibration();
	}
	public void setState(MobileAlert state)
	{
		this.currentState=state;
	}
	@Override
	public void alert() 
	{
		currentState.alert();
		
	}
	
}
