/*  Purpose: Proxy Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.structural.proxy;

public class ProxyTest 
{
	public static void main(String[] args) 
	{
		CommandExecuter executer=new CommandExecuterProxy("admin", "system");
		try
		{
			executer.runCommand("ls-ltr");
			executer.runCommand("rm-rf abc.pdf");
		}
		catch(Exception e)
		{
			System.out.println("Exception Message: "+e.getMessage());
		}
	}
}
