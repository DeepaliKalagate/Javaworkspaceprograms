/*  Purpose: Temprature Conversion from given input.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 19-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.AlgorithmUtility;

public class TempratureConversion 
{
	//Main Function
	public static void main(String[] args) 
	{
		System.out.println("Enter choice what you want : ");
		System.out.println("1.CelsiusToFahrenheit");
		System.out.println("2.FahrenheitToCelsius");
		int no=AlgorithmUtility.IntegerValue();
		//switch case
		switch(no)
		{
		case 1:
			//Celsius to Fahrenheit
			System.out.println("Please enter Celsius : ");
			int celsius=AlgorithmUtility.IntegerValue();
			AlgorithmUtility.celsiusToFahrenheit(celsius);
			break;
			
		case 2:
			//Fahrenheit to Celsius
			System.out.println("Please enter Fahrenheit : ");
			int fahrenheit=AlgorithmUtility.IntegerValue();
			AlgorithmUtility.fahrenheitToCelsius(fahrenheit);
			break;
		default:
			System.out.println("Please enter valid input!");
		}//end switch
	}//end main
}//end class