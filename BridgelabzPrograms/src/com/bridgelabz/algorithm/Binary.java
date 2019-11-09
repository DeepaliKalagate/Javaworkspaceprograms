/******************************************************************************
 *  Purpose: Program is for Binary operation.
 *  		 
 *
 *  @author  Deepali Vasant Kalagate
 *  @version 1.0
 *  @since   30-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.AlgorithmUtility;
public class Binary 
{
	//main method
	public static void main(String[] args) 
	{
		//Variable Declarations
		int decimalNumber;
		int decToBinary;
		int resultOfSwapNibbles;
		System.out.println("Enter a number");
		decimalNumber = AlgorithmUtility.IntegerValue();//calling method
		decToBinary = decimalNumber;
		
		//Calling Method
		resultOfSwapNibbles = AlgorithmUtility.SwapNibbles(decimalNumber,decToBinary);
		System.out.println("Result of Swap Nibbles of binary number: "+resultOfSwapNibbles);
	}

}