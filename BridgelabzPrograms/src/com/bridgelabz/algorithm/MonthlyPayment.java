/*  Purpose: Calculate monthly payment for loan.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 17-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.AlgorithmUtility;

public class MonthlyPayment 
{
	//Main function
	public static void main(String[] args) 
	{
		//Variable Declaration
		int principalLoanAmount,year;
		double roi,amountToPayForMonth;

		System.out.println("Enter Principal Loan Amount : ");
		principalLoanAmount=AlgorithmUtility.IntegerValue();
		System.out.println("Enter Year : ");
		year=AlgorithmUtility.IntegerValue();
		System.out.println("Enter Rate Of Interest : ");
		roi=AlgorithmUtility.DoubleValue();
		//Calling Method
		amountToPayForMonth=AlgorithmUtility.LoanCalculator(principalLoanAmount,year,roi);
		System.out.println("Amount to Pay per month  :"+amountToPayForMonth+" For " +year+" Years");
	}//end main
}//end class