/*  Purpose: Adapter Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 21-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.structural.adapter;

public class AdapterPatternTest 
{
	public static void main(String[] args)
	{
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter()
	{
		SocketAdapter socketAdapter=new SocketObjectAdapter();
		Volt v3=getVolt(socketAdapter,3);	
		Volt v12=getVolt(socketAdapter, 12);
		Volt v120=getVolt(socketAdapter, 120);
		System.out.println("Volt :"+v3.getVolt());
		System.out.println("Volt1 : "+v12.getVolt());
		System.out.println("Volt2 : "+v120.getVolt());
	}
	private static void testClassAdapter() 
	{
		SocketAdapter socketAdapter=new SocketClassAdapter();
		Volt v3=getVolt(socketAdapter,3);	
		Volt v12=getVolt(socketAdapter, 12);
		Volt v120=getVolt(socketAdapter, 120);
		System.out.println("Volt :"+v3.getVolt());
		System.out.println("Volt1 : "+v12.getVolt());
		System.out.println("Volt2 : "+v120.getVolt());		
	}
	private static Volt getVolt(SocketAdapter socketAdapter, int i) 
	{
		switch(i)
		{
		case 3:return socketAdapter.get3volt();
		case 12: return socketAdapter.get12volt();
		case 120:return socketAdapter.get120Volt();
		default: return socketAdapter.get120Volt();
		}
	}
}
