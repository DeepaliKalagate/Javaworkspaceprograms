package com.bridgelabz.designpatterns.behavioral.mediator;

public class UserImpl extends User
{

	public UserImpl(ChatMediator med, String name)
	{
		super(med, name);
		
	}

	@Override
	public void send(String msg)
	{
		System.out.println(this.name+" :Sending message "+msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) 
	{
		System.out.println(this.name+" Received Message "+msg);
		
	}
	
}
