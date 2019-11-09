/*  Purpose: Find prime anagram numbers.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 20-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class PrimeAnagram 
{
	//main function
	public static void main(String[] args) 
	{
		//for loop
		for(int i=1;i<1000;i++)
		{
			AlgorithmUtility.primeNumber(i);
			for(int j=i;j<1000;j++)
			{
				if(i!=j)
				{
					if(AlgorithmUtility.primeNumber(j))
					{
						if (AlgorithmUtility.Anagram(String.valueOf(i), String.valueOf(j))&&AlgorithmUtility.isPalindrome(i)) 
						{
								System.out.println(i + " " + j + " is prime and anagram and palindrome");
						}
					}//end inner if condition
				}//end outer if condition
			}//end inner for loop
		}//end outer for loop
	}//end main
}//end class