/*  Purpose:Take two double command-line arguments t
and v and prints the wind chill.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 18-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill
{
	//Main function
	public static void main(String[] args) 
	{
		System.out.println("Please enter the  tempreture less than 50 Fahrenheit) : ");
	    int t=Utility.IntegerValue();//input from calling function
	    System.out.println("Please enter the  wind speed between 3 to 120 : ");
	    int v=Utility.IntegerValue();//input from calling function
	    //if condition
	    if (t>50 || 3>v || v>120 )
	    {
	    	System.out.println("Please enter value between given Range!");
	    }//end if 
	    else 
	    {
	    	double  w= Utility.windChill(t,v);//Calling Function
	    	System.out.println("National Weather Service defines the effective temperature (the wind chill) to\n" + 
	    			"be:"+w);
	    }//end else
	}//end main
}//end class