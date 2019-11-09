/*  Purpose: Extend the Prime Number Program and store only the numbers in that range that are Anagrams.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 07-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.ListUtility;

public class Anagram 
{
	//Main Function
	public static void main(String[] args)
	{
		//Calling Method
		int res[]=ListUtility.primeAnagrams(1000);
		System.out.println("prime anagram pairs are:");
		//for loop
		for(int i=0;i<158;i=i+2)
		{
			System.out.print(res[i]+" & "+res[i+1]+"\n");
		}//end for loop
	}//end main function
}//end class
