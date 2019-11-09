/*  Purpose: Lazy Initialization Singleton Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.creational.singleton;

public class LazyInitialization
{
	private static LazyInitialization instance;
	private LazyInitialization()
	{
		
	}
	public static LazyInitialization getInitialization()
	{
		if(instance==null)
		{
			instance=new LazyInitialization();
		}
		System.out.println("Lazy Initialization Design pattern");
		return instance;
	}
	public static void main(String[] args) 
	{
		LazyInitialization.getInitialization();		
	}
}
