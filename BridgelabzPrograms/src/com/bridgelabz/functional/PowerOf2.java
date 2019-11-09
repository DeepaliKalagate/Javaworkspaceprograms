/*  Purpose: Take command-line argument and Print a table of the
             powers of 2 that are less than or equal to 2^N.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PowerOf2
{
	public static void main(String[] args)
	{
		//variable declaration
		int result,powerofTwo;
		System.out.println("Enter number : ");
		int number=Integer.parseInt(args[0]);
		int val=Integer.parseInt(args[0]);
		powerofTwo=Utility.powerofTwo(2,number);//calling function
		//if condition
		if(number<31 && val>0)
		{
			//for loop
			for(int i=1;i<=powerofTwo;i++)
			{
				result=Utility.powerofTwo(i, 2);
				System.out.println("Power of "+i+" is "+result);
			}//end for loop
		}//end if
		else
		{
			System.out.println("Enter valid number");
		}//end else
	}//end main
}//end class
