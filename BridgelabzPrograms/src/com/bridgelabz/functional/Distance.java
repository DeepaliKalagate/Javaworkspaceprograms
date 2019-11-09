/*  Purpose: Take two integer command-line arguments calculate Euclidean distance and print it.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 18-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Distance
{
	//Main function
	public static void main(String[] args) 
	{		
		//variable declaration 
		int x,y;
		//input taken values from command line argument
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		
		//calling function
		double distance=Utility.euclideandistance(x,y);
		System.out.println("Distance is :"+distance);
	}//end main
}//end class
