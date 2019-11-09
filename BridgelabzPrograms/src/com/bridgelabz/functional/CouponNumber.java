/*  Purpose: Generating coupon numbers(random).
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Arrays;
import java.util.HashMap;

import com.bridgelabz.utility.Utility;

public class CouponNumber 
{
	//main function
	public static void main(String[] args)
	{
		System.out.println("Enter number for ganerate coupon: ");
		int range=Utility.IntegerValue();//input from calling function
		//Array Declaration
		int[]arr=new int[range];
		int coupon;
		//For loop
		for(int i=0;i<range;i++)
		{
			coupon=Utility.randomNumber(range);
			arr[i]=coupon;
		}//End For loop
		//Sorting Array
		Arrays.sort(arr);
		//printing distinct numbers from array
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>(); 
		//For loop
		for (int i = 0; i < arr.length; i++) 
		{ 
		     hashMap.put(arr[i], i); 
		} //End for loop
		// Using hashMap.keySet() to print output reduces time complexity.
		System.out.println(hashMap.keySet());
	}//end main function
}//end class