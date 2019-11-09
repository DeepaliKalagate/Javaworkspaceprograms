/*  Purpose: Reading data from JSON file and calculate weight and price for each inventory.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.oops;
import com.bridgelabz.utility.OOPUtility;

public class Regex 
{
	public static void main(String[] args) 
	{
		//Scanner scanner = new Scanner(System.in);
		String fullname, number;
		String string = "Hello \\s, We have your full name\r\n"
				+ "as <<fullname>> in our system. your contact number is +91-­xxxxxxxxxx. Please,let us\r\n"
				+ "know in case of any clarification Thank you BridgeLabz Date.";
		System.out.println("Enter fullname :");
		fullname = OOPUtility.isString();
		System.out.println("Enter mobile :");
		number = OOPUtility.isString();

		System.out.println(OOPUtility.message(fullname, number, string));
	}
}
