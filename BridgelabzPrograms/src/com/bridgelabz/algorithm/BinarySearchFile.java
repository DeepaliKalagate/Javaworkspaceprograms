/*  Purpose: Binary Search the Word from Word List which reads from file.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 18-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import com.bridgelabz.utility.AlgorithmUtility;

public class BinarySearchFile 
{
	//main function
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		String[] strArr=null;
		try
		{
			File file=new File("/home/admin1/Desktop/myfile.txt");
			FileReader raf = new FileReader(file);
			BufferedReader bufferedReader=new BufferedReader(raf);
			String str  ;
			 
			 while ((str=bufferedReader.readLine()) != null) 
			 {
				strArr=str.split(",");
			 } 
			 //Printing Unsorted Element
			 System.out.println("unsorted =");
			 for (int i = 0; i < strArr.length; i++)
			 {
				 System.out.print("\t"+strArr[i]);	
				 
			 }
			 //Sorting Array
			 Arrays.sort(strArr);
			 
			//Printing Sorted Element
			 System.out.println("\nSorted =");
			 for (int i = 0; i < strArr.length; i++)
			 {
				 System.out.print("\t"+strArr[i]);	
			 }
			 String str2;
			 System.out.println("\nEnter a charcater to search" );
			 str2 = AlgorithmUtility.StringValue();//Calling method
			 //calling method
			int result=AlgorithmUtility.binarySerch(strArr, str2);
			 if (result == -1) 
		            System.out.println("Element not present"); 
		        else
		            System.out.println("Element found at "
		                              + "index " + result); 
		} //end try block
		
		//catch block
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}//end catch block
	}//end main
}//end class