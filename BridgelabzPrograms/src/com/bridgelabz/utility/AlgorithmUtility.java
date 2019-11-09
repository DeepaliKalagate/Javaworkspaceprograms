package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility 
{
	static Scanner scanner=new Scanner(System.in);
	public static String StringValue() 
	{
		String string=scanner.nextLine();
		return string;
	}
	public static int IntegerValue()
	{
		int integer=scanner.nextInt();
		return integer;
	}
	public static double DoubleValue() 
	{
		double Double=scanner.nextDouble();
		return Double;
	}
	
	/**Method for Finding Strings are Anagram or Not.
	 * 
	 * @param firstString
	 * @param secondString
	 * @return
	 */
			public static boolean Anagram(char[] firstString, char[] secondString) 
			{
				int num1=firstString.length;
				int num2=secondString.length;
				
				if(num1!=num2)
					return false;
				
				Arrays.sort(firstString);
				Arrays.sort(secondString);
				
				
				for(int i=0;i<num1;i++)
				{
					if(firstString[i]!=secondString[i])
						return false;
				}
				return true;
			}

			/**Method for finding Prime Numbers
			 * 
			 * @param number
			 * @return
			 */
			public static boolean primeNumber(int number)
			{
				if (number == 0 || number == 1) 
				{
					return false;
				}
				for (int i = 2; i < number; i++) 
				{
					if (number % i == 0)
					{
						return false;
					}
				}
				return true;
				
			}
			
			/**Method for prime Anagram
			 *  
			 * @param str1
			 * @param str2
			 * @return
			 */
			public static boolean Anagram(String str1, String str2) 
			{
				char[]a=str1.toCharArray();
				char[] b=str2.toCharArray();
				if(str1.length()!=str2.length())
				{
					return false;
				}
				else
				{
					Arrays.sort(a);
					Arrays.sort(b);
				}
				if(a.equals(b))
				{
					return true;
				}
				return false;
			}

			/**Method for prime Palindrome number
			 * 
			 * @param i
			 * @return
			 */
			public static boolean isPalindrome(int i) 
			{
				int r,sum=0;
				int temp=i;
				while(i>0)
				{
					r=i%10;
					sum=sum*10+r;
					i=i/10;
				}
				if(temp==sum)
				{
					return true;
				}
				else
				{
					return false;
				}
				
			}
			
			
			/**Method for Binary Searching-Find word from File
			 * 
			 * @param arr
			 * @param x
			 * @return
			 */
			public static int binarySerch(String[] arr, String x) 
		    { 
				 int l = 0, r = arr.length - 1; 
			        while (l <= r) { 
			            int m = l + (r - l) / 2; 
			  
			            int res = x.compareTo(arr[m]); 
			  
			            // Check if x is present at mid 
			            if (res == 0) 
			                return m; 
			  
			            // If x greater, ignore left half 
			            if (res > 0) 
			                l = m + 1; 
			  
			            // If x is smaller, ignore right half 
			            else
			                r = m - 1; 
			        } 
			  
			        return -1; 
		    } 

			/**Function of bubble sort for binary search file
			 * 
			 * @param arr
			 */
			private static void bubbleSortForBinary(String[] arr) 
			{
				String temp;
				for( int i=0;i<arr.length-1;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i].compareToIgnoreCase(arr[j])>0)
						{
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
			}
			
			/**Function of binary for binary search file
			 * 
			 * @param arr
			 * @param s1
			 * @return
			 */
			public static int binary(String[] arr, String s1)
			{
				int high=arr.length-1, low=0,mid;
				bubbleSortForBinary(arr);

				while (low <= high) {
					mid = (low + high) / 2;
					if (s1.equalsIgnoreCase(arr[mid])) 
					{
						return mid;
					} 
					else if (arr[mid].compareToIgnoreCase(s1) < 0) 
					{
						low = mid + 1;
					} 
					else 
					{
						high = mid - 1;
					}
				}
				return -1;
			}
			
	/**Calculate Elapsed time for sorting Operation
	 * 
	 */
	public static long start=0;
	static long stop=0;
	public AlgorithmUtility()
	{
		 start=System.currentTimeMillis();
		
	} 
	public static double elapsedTime()
	{
		double now = System.currentTimeMillis();
		return now;
	}	
	public static void StopWatch() 
	{
		stop=System.currentTimeMillis();
	}
	
	/**Function of bubble sort for String
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) 
	{
		for (int i = 0; i < arr.length - 1; i++) 
		{
			for (int j = 0; j < arr.length - i - 1; j++) 
			{
				if (arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static String[] stringBubbleSort(String[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++) 
		{
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if (arr[j].compareTo(arr[j + 1]) > 0)
				{
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	/**Function of binary search for integer numbers.
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int intBinarySearch(int[] arr, int key) 
	{
			int start = 0, end = arr.length - 1, mid;
			while (start <= end) 
			{
				mid = start + (end - start) / 2;

				if (arr[mid] == key)
					return mid;

				if (arr[mid] < key)
					start = mid + 1;

				else
					end = mid - 1;
			}
			return -1;
		}
	
	/**Function of binary search for string
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int stringBinarySearch(String[] arr, String key)
	{
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) 
		{
			mid = start + (end - start) / 2;

			if (arr[mid].equals(key))
				return mid;

			if (arr[mid].compareTo(key) > 0)
				start = mid + 1;

			else
				end = mid - 1;
		}
		return 1;
	}
	
	/**Function of insertion sort for integer numbers
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] insertionSort(int[] arr) 
	{
		int key;
		int j = 0;
		for (int i = 1; i < arr.length; i++)
		{
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	
	/**Function of Insertion sort for String
	 * 
	 * @param arr
	 * @return
	 */
	public static String[] stringInsertionSort(String[] arr) 
	{
		String key;
		int j = 0;
		for (int i = 1; i < arr.length; i++) 
		{
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) 
			{
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	
	/**Function for printing Integer array
	 * 
	 * @param arr
	 */
	public static void printIntArr(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**Function for printing String array
	 * 
	 * @param arr
	 */
	public static void printStringArr(String[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**Function for finding magic number
	 * 
	 * @param high
	 * @param low
	 * @return
	 */
	@SuppressWarnings("resource")
	public static int questionToFind(int high, int low) 
	{
		Scanner scanner=new Scanner(System.in);
		if ((high - low)==1) 
		{
		    return low;
		}
		
		int mid=(high+low)/2;
		System.out.println("Is Your number less than "+mid+"  1 to Yes or 0 to NO");
		int a =scanner.nextInt();
		if (a==1) 
		{
		    return questionToFind(low, mid);
		}
		else 
		{
		    return questionToFind(mid, high);
		    
		}
	}
	
	/**Function for finding Day of week
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static boolean validateDate(int month,int day, int year)
	{
		int	y0 = year - (14 - month) / 12;
	    int	x = y0 + (y0/ 4) - (y0 /100) + (y0/400);
	    int	m0 = month + 12* ((14 - month) / 12) - 2;
	    int	d0 = (day + x + 31* m0/12)%7;
	  //switch case
	    switch(d0) 
		{
			case 0:
				System.out.println("Day is Sunday");
				break;
			case 1:
				System.out.println("Day is Monday");
				break;
			case 2:
				System.out.println("Day is Tuesday");
				break;
			case 3:
				System.out.println("Day is Wednesday");
				break;
			case 4:
				System.out.println("Day is Thursday");
				break;
			case 5:
				System.out.println("Day is Friday");
				break;
			case 6:
				System.out.println("Day is Saturday");
				break;
		}//end switch case
		if (year<1582)
			return false;
		if(month<1 || month>12)
			return false ;
		if(day<1 || day>31)
			return false;
		boolean leapyear=true;
		if(month==2) 
			if(leapyear) {
				if(day<1 || day > 29)
					return false;
		}
		else 
		{
			if(day<1 || day >28)
					return false;
		}
		if(month==4 || month ==6 || month ==9 || month ==11)
			if(day<1 || day>30)
				return false; 
		return true;
	}

	/**Function for merge sort
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 */
	public static void mergeSort(String[] arr, int start, int end)
	{
		if (start < end) 
		{
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}

	}
	private static void merge(String[] arr, int start, int mid, int end) 
	{
		int p = start, q = mid + 1;
		String[] newArr = new String[end - start + 1];
		int j = 0;
		for (int i = start; i <= end; i++)
		{
			if (p > mid)
				newArr[j++] = arr[q++];
			else if (q > end)
				newArr[j++] = arr[p++];
			else if (arr[p].compareTo(arr[q]) < 0)
				newArr[j++] = arr[p++];
			else
				newArr[j++] = arr[q++];
		}
		for (int k = 0; k < j; k++) 
		{
			arr[start++] = newArr[k];
		}

	}
		
	/**Function for Calculate Loan
	 * 
	 * @param principalLoanAmount
	 * @param year
	 * @param roi
	 * @return
	 */
		public static double LoanCalculator(int principalLoanAmount, int year, double roi) 
		{
			double payment, r;
			int n;
			n = 12 * year;
			r = (roi / (12 * 100));

			payment = (principalLoanAmount * r) / (1 - Math.pow(1 + r, -n));
			return payment;
		}
	
		/**Function for conversion of celsius to fahrenheit.
		 * 
		 * @param celsius
		 */
		public static void celsiusToFahrenheit(int celsius) 
		{
			int f=(celsius*9/5)+32;
			System.out.println("The fahrenheit degree is: "+f+" for celcius degree:  "+celsius);
		}

		/**Function for conversion of fahrenheit to celsius
		 * 
		 * @param fahrenheit
		 */
		public static void fahrenheitToCelsius(int fahrenheit) 
		{
			int c=(fahrenheit-32)*5/9;
			System.out.println("The celcius degree is: "+c+" for fahrenheit degree:  "+fahrenheit);
		}
		
		/**Function for Calculating Square root using Newton's Method.
		 * 
		 * @param c
		 * @return
		 */
		public static double sqrtNewton(int c) 
		{
			double t,epsilon;
			t=c;
			t=(c/t+c)/2;
			epsilon=1*(Math.pow(10, -15));
			epsilon=1e-15;
			while(Math.abs(t -c/t) > epsilon*t) 
			{
				t=(c/t+t)/2.0;
			}
			System.out.println(t);
			return t;
		}
		
		
		/**
	 * Purpose: adding extra bit into binary number and swap from middle
	 * 
	 * @param decToBinary decimal number input from program
	 * @return returns swap binary numbers
	 */
	public static int SwapNibbles(int decimalNumber,int decToBinary) 
	{
		String x=" ";
		if (decimalNumber > 255) 
		{
			System.out.println("Enter Number between 1 to 255");
		} 
		else 
		{

			while (decimalNumber > 0) 
			{
				 int r = decimalNumber % 2;
				 x = r + "" + x;
				decimalNumber = decimalNumber / 2;
			}

			System.out.println("Binary is: " + x);
		}
		return (((decToBinary & 0x0F) << 4) | ((decToBinary & 0xF0) >> 4));

	}
	
	
}

