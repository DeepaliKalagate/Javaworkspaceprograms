/*  Purpose: Banking Cash Counter where people come in to deposit Cash and withdraw Cash.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 05-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.ListUtility;
public class CashCounter 
{
	//main function
	public static <T> void main(String[] args) 
	{
		System.out.println("Enter how many people in the queue : ");
		//calling function
		int people=ListUtility.IntegerValue();
		ListUtility.cashCounter(people);
	}//end main
}
