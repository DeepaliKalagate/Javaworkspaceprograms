/*  Purpose: Performing particular operations on sorting.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 20-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Arrays;
import com.bridgelabz.utility.AlgorithmUtility;

public class SortUtility 
{
	//Main Function
	public static void main(String[] args) 
	{
		//declaring integer array
		int []a= {2,9,3,8,1,7,4,6,5};
		//declaring String array
		String[] arr= {"Shital","Deepali","Lokesh","Sunil","Sachin"};
		System.out.println("Enter How Many operations do you want to perform: ");
		int number=AlgorithmUtility.IntegerValue();
		System.out.println("1.Insertion Sort for Integer.");
		System.out.println("2.Bubble Sort for Integer.");
		System.out.println("3.Insertion Sort for String.");
		System.out.println("4.Bubble Sort for String.");
		System.out.println("5.Binary search for Integer.");
		System.out.println("6.Binary search for String.");
		// performing particular tasks
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter your choice:");
			int choice=AlgorithmUtility.IntegerValue();
			//switch case
			switch(choice)
			{
			case 1:
				//Calling function of insertion sort for integer number
					AlgorithmUtility.insertionSort(a);
					AlgorithmUtility.printIntArr(a);
					double time3 = AlgorithmUtility.elapsedTime();
					System.out.println("elapsed time for insertion sort of integer is : " + (time3 - AlgorithmUtility.start) / 1000.0);
			break;
			case 2:
				//Calling function of  Bubble sort for integer number
					AlgorithmUtility.bubbleSort(a);
					AlgorithmUtility.printIntArr(a);
					double time4 = AlgorithmUtility.elapsedTime();
					System.out.println("elapsed time for bubble sort of integer is : " + (time4 - AlgorithmUtility.start) / 1000.0);
			break;
			case 3:
				//Calling function of insertion sort for String 
					AlgorithmUtility.stringInsertionSort(arr);
					AlgorithmUtility.printStringArr(arr);
					double time5 = AlgorithmUtility.elapsedTime();
					System.out.println("elapsed time for insertion sort of String is : " + (time5 - AlgorithmUtility.start) / 1000.0);
			break;
			case 4:
				//Calling function of Bubble sort for String
					AlgorithmUtility.stringBubbleSort(arr);
					AlgorithmUtility.printStringArr(arr);
					double time6 = AlgorithmUtility.elapsedTime();
					System.out.println("elapsed time for bubble sort of string is : " + (time6 - AlgorithmUtility.start) / 1000.0);
			break;	
			
			case 5:
				//Calling function of binary search for String 
					System.out.println("index : " + AlgorithmUtility.intBinarySearch(a, 9));
					double time1 = AlgorithmUtility.elapsedTime();
					System.out.println("elapsed time for binary search of integer is : " + (time1 - AlgorithmUtility.start) / 1000.0);
			break;
			case 6:
				//Calling function of binary search for integer number
					Arrays.sort(arr);
					System.out.println("index : " + AlgorithmUtility.stringBinarySearch(arr, "Lokesh"));
					double time2 = AlgorithmUtility.elapsedTime();
					System.out.println("elapsed time for binary search of string is : " + (time2 - AlgorithmUtility.start) / 1000.0);
			break;
			}//end switch
		}//end for loop
		System.out.println("Thank You!");
	}//end main
}//end class