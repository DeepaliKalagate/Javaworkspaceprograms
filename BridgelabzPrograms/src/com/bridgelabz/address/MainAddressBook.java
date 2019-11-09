/*  Purpose: Design of Address Book.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.address;

import com.bridgelabz.utility.OOPUtility;

public class MainAddressBook 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AddressBookManager manager = new AddressBookManager();

		System.out.println("----------Address Book Problem----------");
		try {
			int ch = 0;
			do {
				System.out.println("Choose Option What Do You Want");
				System.out.println("1.Create");
				System.out.println("2.Open");
				System.out.println("3.Save");
				System.out.println("4.SaveAs");
				System.out.println("5.Quit");
				ch = OOPUtility.isInt();
				switch (ch) 
				{
				case 1:
					manager.Create();
					break;

				case 2:
					manager.open();
					break;

				case 3:
					manager.save();
					break;
				case 4:
					manager.saveAs();
					break;

				case 5:
					System.out.println("Exited");
					break;
				default:
					System.out.println("Please Enter Correct Choice");

				}

			} while (ch != 5);
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid input");
		}
		System.out.println("Thank You!");
	}

}