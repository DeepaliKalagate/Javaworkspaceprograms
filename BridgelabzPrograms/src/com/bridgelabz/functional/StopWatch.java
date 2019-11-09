/*  Purpose: Calculating elapsed time.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 17-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class StopWatch 
{
	//main
	public static void main(String[] args) 
	{
		//variable declaration for input
		System.out.println("Enter 1 for Start");
		Utility.IntegerValue();
		Utility.startTime();
		System.out.println("Enter number for Stop");
		Utility.IntegerValue();
		//calling function
		Utility.stopTime();
		Utility.elapsedTime();
	}//end main
}//end class