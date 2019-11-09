/*  Purpose: Simulates a Gambler.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class Gambler 
{
	//Main function
	public static void main(String[] args) 
	{
		int stake,goal,tries;//Variables
		System.out.println("Enter Stake Amount : ");
		stake=Utility.IntegerValue();//input from calling function
		System.out.println("Enter Goal Number: ");
		goal=Utility.IntegerValue();//input from calling function
		System.out.println("Enter Number of Tries : ");
		tries=Utility.IntegerValue();//input from calling function
		//calling function
		Utility.gambler(stake,goal,tries);
	}//end Main function
}//end class
