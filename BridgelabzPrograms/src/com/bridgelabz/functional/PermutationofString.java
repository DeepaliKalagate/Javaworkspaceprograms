/*  Purpose: Permutation of String using Recursive.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 27-09-2019
 *
 ******************************************************************************/package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class PermutationofString 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter string : ");
		String str=Utility.StringValue();
		System.out.println("Permutation String using Recursive : ");
		int n = str.length();
		//Calling method
		Utility.FindPermutation(str, 0, n-1);
	}
}
