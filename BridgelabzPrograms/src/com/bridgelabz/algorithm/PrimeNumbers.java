/*  Purpose: Find prime numbers.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 20-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class PrimeNumbers 
{
	//Main function
	public static void main(String[] args)
	{
		//for loop
		for(int i=0;i<=1000;i++)
		{
			if(AlgorithmUtility.primeNumber(i))
			{
				System.out.println(" "+i);
			}//end if condition
		}//end for loop
	}//end main function
}//end class