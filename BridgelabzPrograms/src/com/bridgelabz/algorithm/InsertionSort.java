/*  Purpose: Performing Insertion sort on String.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 17-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.AlgorithmUtility;

public class InsertionSort 
{
	//Main function
	public static void main(String[] args) 
	{
		String [] array= {"Java","HTML","CSS","PHP","PYTHON"};
		System.out.println();
		System.out.println("Unsorted Array: ");
		//PrintingUnsorted array
		for(String string:array)
		{
			System.out.print(" "+string);
		}
		//Calling method
		AlgorithmUtility.stringInsertionSort(array);
		//Printing Sorted array
		System.out.println("\n");
		for(String string:array)
		{
			System.out.print(" "+string);
		}
	}//end main 
}//end class