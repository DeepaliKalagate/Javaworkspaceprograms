/*  Purpose:Find out  the roots of the equation.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic 
{
	//Main function
	public static void main(String[] args) 
	{
		//variable declaration
		int a,b,c;
		double delta,root1,root2;
		System.out.println("Enter number for A : ");
		a=Utility.IntegerValue();
		System.out.println("Enter number for B : ");
		b=Utility.IntegerValue();
		System.out.println("Enter number for C : ");
		c=Utility.IntegerValue();
		
		//calling method
		delta=Utility.findDeltaSquareRoot(a,b,c);
		System.out.println("Delta : "+delta);
		
		root1=Utility.QuadraticEquation(a,b,delta);
		root2=Utility.QuadraticEquation1(a,b,delta);
				
		//Output for  First Equation
		System.out.println("First Equation is "+root1);
		System.out.println("Second Equation is "+root2);
	}//End main
}//end class