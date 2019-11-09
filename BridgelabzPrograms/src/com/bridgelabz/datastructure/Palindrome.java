/*  Purpose: Banking Cash Counter where people come in to deposit Cash and withdraw Cash.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 07-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.ListUtility;

public class Palindrome 
{
	//main function
	public static void main(String[] args) 
	{
		System.out.println("Enter string : ");
		//calling function
		String string=ListUtility.StringValue();
		ListUtility.isPalindrome(string);
	}//end main
}//end class
