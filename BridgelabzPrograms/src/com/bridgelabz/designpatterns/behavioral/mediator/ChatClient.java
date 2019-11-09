/*  Purpose: Mediator Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 22-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.behavioral.mediator;

public class ChatClient
{
	public static void main(String[] args) 
	{
		ChatMediator mediator=new ChatMediatorImpl();
		User user=new UserImpl(mediator, "Lokesh");
		User user1=new UserImpl(mediator, "Deepali");
		User user2=new UserImpl(mediator, "Anvika");
		User user3=new UserImpl(mediator, "Guru");
		
		mediator.addUser(user);
		mediator.addUser(user1);
		mediator.addUser(user3);
		mediator.addUser(user3);
		
		user.send("Hi All");
	}
}
