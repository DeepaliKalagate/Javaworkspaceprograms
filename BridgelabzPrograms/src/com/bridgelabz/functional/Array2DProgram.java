/*  Purpose: 2D arrays of integers, doubles, or booleans from
	standard input and printing them standard output.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Array2DProgram 
{
	//Main function
	public static void main(String[] args) 
	{
		System.out.println("Enter number of rows: ");
		int m=Utility.IntegerValue();//input from calling function
		System.out.println("Enter number of colomns : ");
		int n=Utility.IntegerValue();//input from calling function
		System.out.println("Enter how many times you want to do loop: ");
		int a=Utility.IntegerValue();//input from calling function
		System.out.println("1.Integer Array.\n2.Double Array.\n3.Boolean Array");
		//For loop
		for(int k=0;k<a;k++)
		{
			System.out.println("Enter Your Choice : ");
			int choice=Utility.IntegerValue();//input from calling function
			//switch case
			switch(choice)
			{
				//Integer Array
			case 1:
				//Integer array declaration
				int[][]arrayInt=new int[m][n];
				System.out.println("Enter all elements:");
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						arrayInt[i][j]=Utility.IntegerValue();			
					}
				}
				System.out.println("Integer Array is :");
				//Printing Result of Integer Array
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.print("\t"+arrayInt[i][j]+"");
					}
					System.out.println("");
				}
				break;
					//Double Array
			case 2:
				//Double array declaration
				double[][]arrayDouble=new double[m][n];
				System.out.println("Enter all elemements(Double):");
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						arrayDouble[i][j]=Utility.DoubleValue();//input from calling function
					}
				}
				System.out.println("Double Array is :");
				//Printing Result of Double Array
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.print("\t"+arrayDouble[i][j]+"");
					}
					System.out.println("");
				}
				break;
					//Boolean Array
			case 3:
				//Boolean array declaration
				String[][]arrayBoolean=new String[m][n];
				System.out.println("Enter All Elements(Boolean): ");
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						arrayBoolean[i][j]=Utility.StringValue();		
					}
				}
				System.out.println("Boolean Array is :");
				//Printing Result of Boolean Array
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.print("\t"+arrayBoolean[i][j]+"");//input from calling function
					}
					System.out.println("");
				}
				break;
			default:
				System.out.println("You have entered wrong choice");
			}//End For loop
			System.out.println("Thank You!");
		}//End Switch case
	}//End Main function
}//End Class