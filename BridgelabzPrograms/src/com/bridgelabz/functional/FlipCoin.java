/*  Purpose: Flip Coin and print percentage of Heads and Tails.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 12-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class FlipCoin 
{
	//main function
	public static void main(String[] args) 
	{
		System.out.println("Enter number for flip the coin: ");
		int flip=Utility.IntegerValue();//input from calling function
		//calling function
		Utility.flipCoin(flip);
	}//end main function
}//end class