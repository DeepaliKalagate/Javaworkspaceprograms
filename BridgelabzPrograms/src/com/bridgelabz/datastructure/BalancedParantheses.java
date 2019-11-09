/*  Purpose: Check Balanced paranthesis or not.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 05-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;
import com.bridgelabz.datastructureutility.Stack;
import com.bridgelabz.utility.ListUtility;
public class BalancedParantheses 
{
	//main function
	public static void main(String[] args)
	{
		System.out.println("Enter expression : ");
		//calling methods
		String expression=ListUtility.StringValue();
		System.out.println(Stack.checkExpression(expression));
	}//end main
}//end class
