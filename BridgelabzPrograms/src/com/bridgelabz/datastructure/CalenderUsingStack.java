/*  Purpose: Create the Week Object maintain also a Week Object in a Stack to
 			 display the Calendar 
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 09-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;
import com.bridgelabz.utility.ListUtility;

public class CalenderUsingStack 
{
	//main function
	public static void main(String[] args) 
	{
		System.out.println("Enter Month : ");
		// Converting string to integer 
		int month = Integer.parseInt(args[0]);
		System.out.println("Enter year : ");
		int year = Integer.parseInt(args[1]);
		//calling function
		ListUtility.calenderStack(month, year);
	}//end main
}//end class
