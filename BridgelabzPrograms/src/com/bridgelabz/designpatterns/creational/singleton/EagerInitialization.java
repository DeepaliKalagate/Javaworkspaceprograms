/*  Purpose: Eager initialization Singleton Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.creational.singleton;

public class EagerInitialization
{

	private static final  EagerInitialization instance=new EagerInitialization();
	private EagerInitialization()
	{
		
	}
	public static EagerInitialization getInstance()
	{
		System.out.println("\n");
		System.out.println("Eager Initialization design pattern created.");
		return instance;
	}
	
	public static void main(String[] args) 
	{
		EagerInitialization.getInstance();
		EagerInitialization.getInstance();
	}
}
