/*  Purpose: StaticBlockSingleton Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.creational.singleton;

public class StaticBlockSingleton 
{



    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    
    //static block initialization for exception handling
    static
    {
        try
        {
        	instance = new StaticBlockSingleton();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance()
    {
        return instance;
    }
    public static void main(String[] args)
    {
		StaticBlockSingleton.getInstance();
		System.out.println("Static Block Singleton Design Pattern");
	}
}

