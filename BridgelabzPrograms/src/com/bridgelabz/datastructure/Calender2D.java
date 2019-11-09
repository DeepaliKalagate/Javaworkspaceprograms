/*  Purpose: Display the Calendar in 2D Array. 
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 05-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.ListUtility;

public class Calender2D 
{
	//main function
	public static void main(String[] args) 
	{
		System.out.println("enter month");
		int month = ListUtility.IntegerValue();//calling function
		System.out.println("enter yaer");
		int year = ListUtility.IntegerValue();//calling function
		ListUtility.calenderShow(month, year);
	}//end main
}//end class
