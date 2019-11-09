/*  Purpose: Find two strings are anagram or not.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 20-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.AlgorithmUtility;

public class Anagram 
{
	//Main function
	public static void main(String[] args)
	{
		System.out.println("Enter First String : ");
		String firstString=AlgorithmUtility.StringValue();
		System.out.println("Enter Second String : ");
		String secondString=AlgorithmUtility.StringValue();
		char[]a=firstString.toCharArray();
		char[]b=secondString.toCharArray();
		//If condition with Calling Method
		if(AlgorithmUtility.Anagram(a,b))
		{
			System.out.println("The two Strings are Anagram!");
		}
		else
		{
			System.out.println("The two Strings are not Anagram!");
		}//end if
	}//end main
}//end class
