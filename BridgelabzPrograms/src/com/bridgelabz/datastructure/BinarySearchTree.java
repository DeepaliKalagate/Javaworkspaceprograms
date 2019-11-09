/*  Purpose: Binary Search Tree.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 05-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.ListUtility;

public class BinarySearchTree 
{
	//main function
	public static void main(String[] args)
	{
		System.out.println("Enter total number of testcases : ");
		double testCases=ListUtility.DoubleValue();
		//while loop
		while(testCases>0)
		{
			System.out.println("Enter total number of nodes: ");
			double testNodes=ListUtility.DoubleValue();
			double totalTree=ListUtility.binarySearchTree(testNodes);
			System.out.println(totalTree);
			testCases--;
		}//end while loop
		System.out.println("Ends");
	}	//end main
}//end class
