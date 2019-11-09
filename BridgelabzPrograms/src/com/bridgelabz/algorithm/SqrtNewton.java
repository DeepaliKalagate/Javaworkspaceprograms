/*  Purpose: Compute the square root of a nonnegative number using Newton's method.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 28-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class SqrtNewton 
{
	//Main Function
	public static void main(String[] args) 
	{
		System.out.println("Enter non-negative number : ");
		int number=AlgorithmUtility.IntegerValue();
		//If condition
		if(number>0)
		{
			//Calling Method
			AlgorithmUtility.sqrtNewton(number);
		}//end if
		else
		{
			System.out.println("Enter Positive Number!");
		}
	}//end Main
}//end class