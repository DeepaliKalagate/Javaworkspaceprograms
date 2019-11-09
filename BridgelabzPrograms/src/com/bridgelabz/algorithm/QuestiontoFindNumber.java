/*  Purpose: Question to find your number.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 17-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.AlgorithmUtility;

public class QuestiontoFindNumber 
{
	//Main function
	public static void main(String[] args)
	{
		System.out.println("Enter num of questions ");
		int k =AlgorithmUtility.IntegerValue();
		int n = (int) Math.pow(2, k);
		System.out.println("Think of an integer between 0 and"+(n-1));
		//Calling Method
		int secret = AlgorithmUtility.questionToFind(0, n);
		System.out.println("Your number is  "+secret);
	}//end main
}//end class