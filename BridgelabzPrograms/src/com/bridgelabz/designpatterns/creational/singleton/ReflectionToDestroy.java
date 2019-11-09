/*  Purpose: Reflection To Destroy Singleton Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionToDestroy 
{
	public static void main(String[] args) 
	{
		EagerInitialization eagerInitialization=EagerInitialization.getInstance();
		EagerInitialization eagerInitialization2=null;
		try
		{
			Constructor[] constructors=EagerInitialization.class.getDeclaredConstructors();
			for(Constructor constructor:constructors)
			{
				constructor.setAccessible(true);
				eagerInitialization2=(EagerInitialization) constructor.newInstance(constructors);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		System.out.println(eagerInitialization.hashCode());
		System.out.println(eagerInitialization2.hashCode());
	}
}
