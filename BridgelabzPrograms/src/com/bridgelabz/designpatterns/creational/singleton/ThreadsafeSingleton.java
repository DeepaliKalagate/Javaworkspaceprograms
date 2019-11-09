/*  Purpose: ThreadsafeSingleton Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.creational.singleton;

public class ThreadsafeSingleton 
{
	private static ThreadsafeSingleton threadsafeSingleton;
	private ThreadsafeSingleton()
	{
	}
	public static synchronized ThreadsafeSingleton getThreadsafeSingleton()
	{
		if(threadsafeSingleton==null)
		{
			threadsafeSingleton=new ThreadsafeSingleton();
		}
		return threadsafeSingleton;
	}
	

public static ThreadsafeSingleton getInstanceUsingDoubleLocking()
{
    if(threadsafeSingleton == null)
    {
        synchronized (ThreadsafeSingleton.class)
        {
            if(threadsafeSingleton == null)
            {
            	threadsafeSingleton = new ThreadsafeSingleton();
            }
        }
    }
    return threadsafeSingleton;
}

	
	public static void main(String[] args) 
	{
		ThreadsafeSingleton.getThreadsafeSingleton();
		System.out.println("Threadsafe singleton single...");
		ThreadsafeSingleton.getInstanceUsingDoubleLocking();		
		System.out.println("Thread safe Singleton");
	}
}
