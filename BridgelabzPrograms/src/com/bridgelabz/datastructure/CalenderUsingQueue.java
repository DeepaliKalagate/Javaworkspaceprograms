/*  Purpose: Create the Week Object maintain also a Week Object in a Queue to
 			 display the Calendar 
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 09-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.ListUtility;

public class CalenderUsingQueue 
{
	//main function
	public static void main(String[] args)
	{
		// Converting string to integer 
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		ListUtility.calenderQueue(month, year);
	}//end main
}//end class
