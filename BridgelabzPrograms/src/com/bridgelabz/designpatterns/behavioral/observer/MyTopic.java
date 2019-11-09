package com.bridgelabz.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject
{
	private List<Observer> observer;
	private String message;
	private boolean changed;
	private final Object MUTEX=new Object();
	public MyTopic()
	{
		this.observer=new ArrayList<Observer>();
	}
	public void register(Observer obj)
	{
		if(obj==null)throw new NullPointerException();
		synchronized (MUTEX) 
		{
			if(!observer.contains(obj))observer.add(obj);	
		}
		
	}
	public void unregister(Observer obj) 
	{
		synchronized (MUTEX)
		{
			observer.remove(obj);	
		}
		
	}	
	public void notifyObserver()
	{
		List<Observer> observerLocal=null;
		synchronized (MUTEX) 
		{
			if(!changed)
				return;
			observerLocal=new ArrayList<Observer>();
			this.changed=false;
		}
		for(Observer obj:observerLocal)
			obj.update();
	}
	public Object getUpdate(Observer obj) 
	{
		return this.message;
		
	}
	public void postMessage(String msg)
	{
		System.out.println("Message Posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObserver();
	}
}
 