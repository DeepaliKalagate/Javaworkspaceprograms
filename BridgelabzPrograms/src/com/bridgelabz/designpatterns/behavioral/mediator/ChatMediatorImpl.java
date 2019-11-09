package com.bridgelabz.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator
{
	private List<User> users;
	public ChatMediatorImpl()
	{
		this.users=new ArrayList<User>();
	}
	public void addUser(User user)
	{
		this.users.add(user);
	}
	@Override
	public void sendMessage(String msg, User user) 
	{
		for(User u:users)
		{
			if(u!=users)
			{
				u.receive(msg);
			}
		}
	}
}
