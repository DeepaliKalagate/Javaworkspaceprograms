/*  Purpose: Performing Bubble sort on String.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 17-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.AlgorithmUtility;

public class BubbleSort
{
	//Main function
	public static void main(String[] args) 
	{
		System.out.println("Enter how many element you want : ");
		int n=AlgorithmUtility.IntegerValue();
		int []arr=new int[n];
		System.out.println("Enter All Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=AlgorithmUtility.IntegerValue();//Calling Method
		}
		//Printing Unsorted Array
		System.out.println("Given Array is: ");
		for(int array:arr)
		{
			System.out.print(" "+array);
		}
		//Calling Method 
		AlgorithmUtility.bubbleSort(arr);
		//Printing Sorted Array
		System.out.println("\nSorted array is : ");
		for(int array:arr)
		{
			System.out.print(" "+array);
		}
	}//end main
}//end class