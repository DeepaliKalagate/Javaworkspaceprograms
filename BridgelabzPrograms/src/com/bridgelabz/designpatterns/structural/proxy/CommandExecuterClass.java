package com.bridgelabz.designpatterns.structural.proxy;

public class CommandExecuterClass implements CommandExecuter
{
	public void runCommand(String cmd) throws Exception 
	{
		Runtime.getRuntime().exec(cmd);
		System.out.println(" "+cmd+"Command Excuted");
	}
}
