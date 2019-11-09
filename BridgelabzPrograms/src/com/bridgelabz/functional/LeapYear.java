/*  Purpose: Determine whether chack Leap Year or not.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 10-09-2019
 *
 ******************************************************************************/package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class LeapYear
{
	//Main function
	public static void main(String[] args) 
	{
		System.out.println("Enter Year : ");
		int year=Utility.IntegerValue();//input from calling function
		//if condition
		Utility.leapYear(year);		
	}//end main
}//end class