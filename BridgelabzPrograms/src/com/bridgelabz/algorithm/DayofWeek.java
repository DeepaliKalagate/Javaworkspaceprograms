/*  Purpose: Finding Day of week from given input.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.AlgorithmUtility;

public class DayofWeek
{
	//Main function
	public static void main(String[] args) 
	{
		//Variable Declaration of integer and boolean
		int day,month,year;
		day=Integer.parseInt(args[0]);
		month=Integer.parseInt(args[1]);
		year=Integer.parseInt(args[2]);
		//If condition with Calling method
		if(AlgorithmUtility.validateDate(month,day,year)) 
		{
		   	    
		}//end if
		else 
		{
			System.out.println("Invalid Date");
		}		
	}//end main
}//end class