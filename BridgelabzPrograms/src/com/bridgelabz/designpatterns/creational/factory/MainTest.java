/*  Purpose: Factory Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.creational.factory;

public class MainTest
{
	public static void main(String[] args) 
	{
		Computer pc=ComputerFactory.getComputer("Pc", " 500 GB", " 4 GB", " 9.1 Ghz");
		Computer server=ComputerFactory.getComputer("server", " 16 GB", " 40 GB", " 15.4 Ghz");
		System.out.println("Get PC Config : "+pc);
		System.out.println("Get Server Config : "+server);
	}
}
