package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.datastructureutility.Dequeue;
import com.bridgelabz.datastructureutility.LinkedList;
import com.bridgelabz.datastructureutility.OrderedLinkedList;
import com.bridgelabz.datastructureutility.Queue;
import com.bridgelabz.datastructureutility.Stack;

public class ListUtility 
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
	
	/**Fuction for Ordered List
	 * 
	 */
	public static void orderedList()
	{
		OrderedLinkedList<Integer> linkedList=new OrderedLinkedList<Integer>();
		int []a=OrderedLinkedList.readFile();
		int[] arr=OrderedLinkedList.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		for(int j=0;j<a.length;j++)
		{
			linkedList.append(arr[j]);
		}
		System.out.println("Enter numberto search element: ");
		int i=ListUtility.IntegerValue();
		
		int result=OrderedLinkedList.search(arr, i);
		if(result==-1)
		{
			System.out.println("Element not found");
			linkedList.append(i);
			linkedList.show();
			linkedList.writeOnFile();
			System.out.println("Successfully written on file!");
			int size1=linkedList.size();
			System.out.println("Size of linked list is : "+size1);
			
		}
		else
		{
			System.out.println("Element found at : "+result);
			linkedList.remove(result);
			System.out.println("Successfully deleted element!");
			linkedList.show();
			linkedList.writeOnFile();
			int size=linkedList.size();
			System.out.println("Size of linked list is : "+size);
		}
	}
	
	/**Function for UnOrdered list
	 * 
	 * @throws IOException
	 */
	public static void unOrderedList() throws IOException
	{
		String line = " ";
		String words[]=new String[10];
		int count = 0;
		
		FileReader fileReader=new FileReader("/home/admin1/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/files/file.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		
		 //Gets each line till end of file is reached
		while((line=bufferedReader.readLine())!=null)
		{
			//Splits each line into words
			words=line.split(" ");
			 //Counts each word
			count=count+words.length;
		}
		System.out.println(".........Words present in file.........");
		LinkedList linkedList=new LinkedList();
		
		for(int i=0;i<words.length;i++)
		{
			String str=words[i];
			linkedList.insert(str);
		}
		
		linkedList.show();
		int size=LinkedList.size();
		System.out.println("Size of linked list is : "+size);
		System.out.println("Enter element which you want: ");
		String element=ListUtility.StringValue();
		boolean flag1=linkedList.searchNode(element);
		if(flag1==false)
		{	
			System.out.println("Element not found!");

			LinkedList.writeOnFile();
			System.out.println("Successfully written on file!");
			int size1=linkedList.lengthOfLinkedList();
			System.out.println("Size of linked list is : "+size1);
			linkedList.show();			
		}
		else
		{
			LinkedList.writeOnFile();
			linkedList.deleteNode(element);	
			System.out.println("Successfully deleted element!");
			int size2=linkedList.lengthOfLinkedList();
			System.out.println("Size of linked list is : "+size2);
			linkedList.show();
		}
		bufferedReader.close();
	}
	
	/**Function for Banking Cash Counter.
	 * 
	 * @param people
	 */
	public static void cashCounter(int people) 
	{
		int balance=1000;
		//for loop
		for(int i=0;i<people;i++)
		{
			
			System.out.println("What do you want to do ");
			System.out.println("1. Deposite ");
			System.out.println("2. Withdraw ");	
			System.out.println("enter your choice ");
			int choice=Utility.IntegerValue();
			//switch case
			switch (choice) 
			{
			case 1:
						System.out.println("How much money you want to deposite : ");
						int money1=Utility.IntegerValue();
						Queue.enQueue(money1);
						balance=balance+money1;
						System.out.println("Your Balance is : "+balance);
						int size=Queue.size();
						System.out.println("size of queue:"+size);
						//q.deQueue();
						
						break;
						
					case 2:
						System.out.println("How much money you want to withdraw : ");
						
						int withdraw=Utility.IntegerValue();
						
						Queue.enQueue(withdraw);
						if(balance>withdraw)
						{
							balance=balance-withdraw;
							System.out.println("Your remaining balance is: "+balance);
						}
						else
						{
							System.out.println("insufficient balance");
						}
						//int size3=q.size();
						//System.out.println("size of queue:"+size3);
						Queue.deQueue();
						//int size4=q.size();
						//System.out.println("size of queue:"+size4);
						break;
						
	
					default:
						System.out.println("enter valid choice");
						break;
					}//end switch case
		}//end for loop
		
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
	
	/**Function for check Day of Week
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int month, int day, int year) 
	{
		
			int	y = year - (14 - month) / 12;
		    int	x = y + (y/ 4) - (y /100) + (y/400);
		    int	m = month + 12* ((14 - month) / 12) - 2;
		    int	d = (day + x + 31* m/12)%7;
		return d;
	}
	
	/**Function for check Leap or not.
	 * 
	 * @param year
	 * @return
	 */
	public static boolean leapYear(int year) 
	{
			if((year%4==0)&&(year%100!=0)||(year%400==0))
			{
				return true;
			}
			return false;		 
	}
	
	

	/**function for Prime Number 2D Array
	 * 
	 */
	public static void isPrimeNumber()
	{
		System.out.print("\t\t\t\t");
		for (int x = 1; x <= 25; x++) 
		{
			System.out.print("col" + x + "\t");
		}
		System.out.println("\n");

		int prime[][] = prime2DArray(1000);

		for (int k = 0; k < 10; k++) 
		{
			System.out.print("range:" + (k * 100 + 1) + "-" + (k * 100 + 100) + "\t");
			System.out.print(" row" + (k + 1) + "-->  ");
			for (int l = 0; l < 25; l++) 
			{
				System.out.print(prime[k][l] + "\t");
			}
			System.out.println();
		}
	}
	
	/**Function for Binary Search Tree
	 * 
	 * @param total
	 * @return
	 */
	public static double binarySearchTree(double total) 
	{
		double numerator=factor(2*total);
		double denominator=factor(total+1)*factor(total);
		double diffrence=numerator/denominator;
		return diffrence;
		
	}
	
	/**Function Factor for Binary Search Tree
	 * 
	 * @param d
	 * @return
	 */
	private static double factor(double d) 
	{
		double a=1;
		while(d>0)
		{
			a=a*d;
			d--;
		}
		return a;
	}
	
	/**Function for Print calender
	 * 
	 * @param month
	 * @param year
	 */
	public static void calenderShow(int month, int year)
	{

		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		int arr[][] = new int[6][7];
		//get d0 value hence upto d0 we will add null values
		int d=1,y=year,m=month;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		System.out.println(d0);
		int start=d0;
		int count =1;
		//assign total number of days in month
		int totalDaysInMonth = 0;
		if (month == 2) 
		{
		if(ListUtility.leapYear(year)) //if leap year,days in feb will be 29
			totalDaysInMonth = 29;
		else 
			totalDaysInMonth = 28;
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
			totalDaysInMonth = 31;
		else 
			totalDaysInMonth = 30;
		
		
	outer:	for (int i = 0; i < 6; i++) 
		{
			for (int j = start; j < 7; j++) 
			{
				if (count <= totalDaysInMonth) 
				{
					arr[i][j] = count;
					count++;
				} 
				else 
				{
					break outer;
				}
			}
			start = 0;
		}
		System.out.println(s[month-1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 7; j++) 
			{
				if (arr[i][j] == 0) 
				{
					System.out.print("   ");
				} 
				else if (arr[i][j] > 9) 
				{
					System.out.print(arr[i][j] + " ");
				} 
				else 
				{
					System.out.print(arr[i][j] + "  ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	/**Function for Checking Prime Numbers
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n)
	{
		
		for(int j=2;j<=n/2;j++) 
		{
			int rem = n % j;
			
			if(rem == 0) 
			{
				return false;
			}
			
		}
		return true;

	}
	
	/**Function for Prime numbers in 2D array in rows.
	 * 
	 * @param n
	 * @return
	 */
	public static int[][] prime2DArray(int n) 
	{
		int [][]prime = new int [10][25];
		int first=0,second=0,third=0,fourth=0;
		int fifth=0,sixth=0,seventh=0,eight=0,nineth=0,ten=0;
	
		for(int i=2;i<n;i++) 
		{
			
			if(isPrime(i))  //check foo prime
			{
			
				if((i > 0) && (i<= 100))
				prime[0][first++] = i;
		
				else if((i > 100) && (i <= 200))
					prime[1][second++]=i;
				
				else if((i > 200) && (i<= 300)) 
					prime[2][third++] = i;
				
				else if((i> 300) && (i <= 400)) 
					prime[3][fourth++] =i;
				
				else if((i > 400) && (i <= 500)) 
					prime[4][fifth++] = i;
				
				else if((i> 500) && (i <= 600)) 
					prime[5][sixth++] = i;
				
				else if((i>600)&&(i<=700)) 
					prime[6][seventh++]=i;
				
				else if((i> 700) && (i <= 800)) 
					prime[7][eight++] = i;
				
				else if((i> 800) && (i <= 900)) 
					prime[8][nineth++] = i;
				
				else if((i> 900) && (i <= 1000))
				{	
					prime[9][ten++] = i;
				}
			}
		}
		return prime;
	}
	
	/**Function for Prime Anagram using Queue
	 * 
	 */
	public static void queueAnagram()
	{
		//Variable Declarations
		int y = 0;

		int[] arr = new int[170];
		//for loop
		for (int i = 1; i <= 1000; i++) 
		{
			boolean flag = true;
			//inner for loop
			for (int j = 2; j < i - 1; j++)
			{
				//if condition
				if (i % j == 0) 
				{
					flag = false;
					break;
				}//end if
			}//end inner for loop
			//if condition
			if (flag == true) 
			{
				arr[y] = i;
				y++;
			}//end if condition	
		}//end for loop
		int[] a= new int[170];
		
		for(int i=0;i<arr.length;i++)
		{
			a[i]=arr[i];
			
		}
		StringBuffer sb= new StringBuffer(arr.length);
		
		String s=" ";
		
		for(int i=0;i<arr.length;i++)
		{
			s=sb.append(a[i]+" ").toString();
		}
		
		String[] str=s.split(" ");
		
		for(int k=0;k<str.length-1;k++)
		{
			for(int l=k+1;l<str.length;l++)
			{
				if(ListUtility.isAnagram(str[k], str[l]))
				{
					 int n1=Integer.parseInt(str[k]);
					// System.out.println(n1);
					 Queue.enQueue(n1);
					 int value1=Queue.deQueue();
					 System.out.print(" "+value1);
					 
					 int n2=Integer.parseInt(str[l]);
					 Queue.enQueue(n2);
					 //System.out.println(n2);
					 int value2=Queue.deQueue();
					 System.out.print(" "+value2);
				}
			}
		}
	}
	
	/**Function for Prime And Anagram in 2D array
	 * 
	 * @param range
	 * @return
	 */
	public static int[] primeAnagrams(int range) 
	{
			int index = 0;
			String[] array1 = new String[168];
			int[] anagram = new int[158];  //to store anagrams
			int count = 0;
			
			for(int i=2;i<range;i++)
			{
				if(isPrime(i)) //check for prime
				{
					array1[index] = String.valueOf(i); // integer to string conversion
					index++;
				}
			}
			for(int i=0;i<index;i++)  //to traverse array
			{
				for(int j=i+1;j<index;j++)
				{
					if(isAnagram(array1[j], array1[i])) //to compare ith element with jth element
					{ 
						//store ith as well as jth positions numbers
						anagram[count] = Integer.parseInt(array1[i]);  //String to integer
						count++;
						anagram[count] = Integer.parseInt(array1[j]);
						count++;
					}
				}
			}
			return anagram;
		}
	
	/**Fuction for Check the Anagram numbers
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isAnagram(String str1, String str2)
	{
			boolean status=true;
			if(str1.length() != str2.length())  //check length of two strings are equal or not
				status = false;
			else 
			{ 
				//convert strings to character array to compare their characters
				char[] str1Array = str1.toCharArray();
				char[] str2Array = str2.toCharArray();
				//sort both char arrays
				Arrays.sort(str1Array);
				Arrays.sort(str2Array);
				status = Arrays.equals(str1Array, str2Array); //compare two arrays
	 		}
			if(status)
				return true;
			else 
				return false;
		}
	
	/**Function for Displaying Calender Using Queue
	 * 
	 * @param month
	 * @param year
	 */
	public static void calenderQueue(int month,int year)
	{
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Checking given year is leap year or not 

		if (month == 2 && ListUtility.leapYear(year))
		{
			days[month] = 29;
		}

		// Use inbuilt method for week decision

		int d = ListUtility.dayOfWeek(1, month, year);

		int[][] arr = new int[6][7];

		// date start from 1

		int z = 1;

		for (int i = 0; i < 6; i++) 
		{
			for (int j = d; j < 7; j++) 
			{
				if (z <= days[month]) 
				{
					arr[i][j] = z;
					z++;
				}
			}
			d = 0;
		}

		for (int j = 0; j < d; j++) 
		{
			arr[0][j] = arr[5][j];
		}

		System.out.println(" " + months[month] + " " + 1 + " " + year);

		System.out.println(
				"Sun" + "\t" + "Mon" + "\t" + "Tue" + "\t" + "Wed" + "\t" + "Thu" + "\t" + "Fri" + "\t" + "Sat" + "\t");

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				if (arr[i][j] != 0)
				{
					System.out.print(arr[i][j] + "\t ");
					Queue.enQueue(arr[i][j]);
				}	
				else
					System.out.print("\t ");
			}
			System.out.println("\n----------------------------------------------------");
		}

	}
	
	
	/**Function to print calendar using stack	
	 * 
	 * @param month
	 * @param year
	 */
		public static void calenderStack(int month,int year)
		{
			String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
					"October", "November", "December" };

			int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			
			// Checking given year is leap year or not 

			if (month == 2 && ListUtility.leapYear(year))
			{
				days[month] = 29;
			}

			// Use inbuilt method for week decision

			int d = ListUtility.dayOfWeek(1, month, year);

			int[][] arr = new int[6][7];

			// date start from 1

			int z = 1;

			for (int i = 0; i < 6; i++) 
			{
				for (int j = d; j < 7; j++) 
				{
					if (z <= days[month]) 
					{
						arr[i][j] = z;
						z++;
					}
				}
				d = 0;
			}

			for (int j = 0; j < d; j++) 
			{
				arr[0][j] = arr[5][j];
			}

			System.out.println(" " + months[month] + " " + 1 + " " + year);

			System.out.println(
					"Sun" + "\t" + "Mon" + "\t" + "Tue" + "\t" + "Wed" + "\t" + "Thu" + "\t" + "Fri" + "\t" + "Sat" + "\t");

			for (int i = 0; i < 5; i++)
			{
				for (int j = 0; j < 7; j++)
				{
					if (arr[i][j] != 0)
					{
						System.out.print(arr[i][j] + "\t ");
						Stack.pushCalender(arr[i][j]);
					}	
					else
						System.out.print("\t ");
				}
				System.out.println("\n----------------------------------------------------");
			}

		}
		
		/**Function for checking string palindrome or not
		 * 
		 * @param string
		 */
		public static void isPalindrome(String string)
		{
			char [] ch=string.toCharArray();
			int flag=0;
			
			for(int i=0;i<ch.length;i++)
			{
				char element=ch[i];
				Dequeue.insertElementAtRear(element);
			}
			
			for(int i=0;i<ch.length/2-1;i++)
			{
				if(Dequeue.deleteFront()!=Dequeue.deleteRear())
				{
					flag=1;
					break;
				}
			}
			int size=Dequeue.size();
			System.out.println("Size of queue : "+size);
			if(flag==0)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
		}
}
