/******************************************************************************
 *  Purpose: Calculating number notes returned by Vending machine.
 *  		 
 *
 *  @author  Deepali Vasant Kalagate
 *  @version 1.0
 *  @since   30-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.AlgorithmUtility;

public class VendingMachine 
{
	// Static Variables i for indexing the array and total for calculating the total Notes
	  	static int i=0;
	  	static int total=0;

	  	//Initialization of New Array
	  	static int[] notes = { 2000,1000,500,100,50,20,10,5,2,1};
	  	static int money;

	  	static void notes(int value) 
		{
			if (value / notes[i] != 0) 
			{
				total += (value / notes[i]);
				System.out.println(notes[i] + "rs notes :" + value / notes[i]);
				value = value % notes[i];
			}
			i++;
			if (value == 0)
			{
				System.out.println("total notes :" + total);
				return;
			}

			notes(value);

		}
	  	//Main Function
		public static void main(String[] args)
		{
			System.out.print("Enter the Amount:");
			money =AlgorithmUtility.IntegerValue();

			// Calling Method
			notes(money);
			System.out.println("Total Number of Notes are :"+total);
		}//end main
}//end class
