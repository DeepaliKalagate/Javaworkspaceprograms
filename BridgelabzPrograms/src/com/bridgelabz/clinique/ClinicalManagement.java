/*  Purpose: Clinique Management Program.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.clinique;

import com.bridgelabz.utility.OOPUtility;

public class ClinicalManagement
{

	public static void main(String[] args)
	{
		DoctorPatientOperations doctorpatient = new DoctorPatientOperations();
		DoctorPatientData data = new DoctorPatientData();
		DoctorPatientSearch search = new DoctorPatientSearch();

		int choice = 0;
		System.out.println("----------Welcome To Clinical Managament System----------\n");

		do
		{
			System.out.println("1.Operation for Doctor Patient Appointment");
			System.out.println("2.Searching");
			System.out.println("3.Show Data");
			System.out.println("4.Exit");
			choice = OOPUtility.isInt();
			switch (choice) 
			{
			case 1:
				doctorpatient.operation();
				break;

			case 2:
				search.opeartion();
				break;

			case 3:
				data.opeartion();
				break;

			case 4:
				System.out.println("Exited");

				break;
			default:
				System.out.println("Please Enter Correct Choice");
			}
		} while (choice != 4);
		System.out.println("Thank you!");
	}
}
