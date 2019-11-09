/*  Purpose: Prints the Nth harmonic number series.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber 
{
	//main function
	public static void main(String[] args) 
	{
		System.out.println("Enter number: ");
		int number=Utility.IntegerValue();//input from calling function
		System.out.println("Harmonic Number Series is : ");
		//Calling function
		Utility.harmonicNumber(number);		
	}//end main function
}//end class