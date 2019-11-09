/*  Purpose: Determines finding triplet to sum of three numbers adds to zero.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 16-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class SumOfNumbersAddTo0 
{
	//main function
	public static void main(String[] args) 
	{
		//Array declaration
		int []arr= {1,-1,2,-2,3,-3,0,5,-5};
		System.out.println("Triplets are : ");
		//calling function
		Utility.sumOfNumberAddToZero(arr);
	}//end main
}//end class