/*  Purpose: Enum Initialization Singleton Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.creational.singleton;

public enum EnumSigleton 
{
	instance;
	public void dosomething()
	{
		System.out.println("Enum Singleton");
	}
	public static void main(String[] args) 
	{
		EnumSigleton e1=EnumSigleton.instance;
		EnumSigleton e2=EnumSigleton.instance;
		e1.dosomething();
		System.out.println(e1);
		System.out.println(e2);
	}
}
