/*  Purpose: Performing merge sort on String.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 17-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class MergeSort 
{
	//Main function
	public static void main(String[] args) 
	{
		//Variable declaration
		String[] arr= {"Lokesh","Deepali","Anvika","Veer","Siddhant","Suyesh","Aayush"};
		int start=0,end=arr.length-1;
		//Calling methods
		AlgorithmUtility.mergeSort(arr,start,end);
		AlgorithmUtility.printStringArr(arr);
	}
}