package com.bridgelabz.designpatterns.structural.proxy;

public class CommandExecuterProxy implements CommandExecuter
{
	private boolean isAdmin;
	private CommandExecuter executer;
	public CommandExecuterProxy(String user,String password)
	{
		if("admin".equals(user) && "system".equals(password))isAdmin=true;
		executer=new CommandExecuterClass();
	}
	public void runCommand(String cmd) throws Exception 
	{
		if(isAdmin)
		{
			executer.runCommand(cmd);
		}
		else
		{
			if(cmd.trim().startsWith("rm"))
			{
				throw new Exception("rm command is not for allowed non user");
			}
			else
			{
				executer.runCommand(cmd);
			}
		}
	}
	
}
