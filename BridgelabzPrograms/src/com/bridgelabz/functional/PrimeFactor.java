/*  Purpose:Computes the prime factorization of N
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 12-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class PrimeFactor
{
	//main function
	public static void main(String[] args)
	{
		System.out.println("Enter number : ");
		int number=Utility.IntegerValue();//input from calling function
		int fact=1;
		//for loop
		for(int i=2;i*i<=number;i++)
		{
			//if condition
			if(Utility.primeNumber(i))//calling prime number function
			{
				fact=Utility.primeFactor(number);//calling factor function
				System.out.println("Factorial of number: "+number+" is : "+fact);
				
			}//end if
		}//end for
	}//end main
}//end class