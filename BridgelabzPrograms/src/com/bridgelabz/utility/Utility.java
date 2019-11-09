package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility 
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
	
	/**Function for Flip Coin Program
	 * 
	 * @param flip
	 */
	public static void flipCoin(int flip) 
	{
		int countTail=0;
		int countHead=0;
		for(int i=0;i<flip;i++)
		{
			if(Math.random()<0.5)
			{
				System.out.println("It is Tail");
				countTail++;
			}
			else
			{
				System.out.println("It is Head");
				countHead++;
			}
		}
		int tailPercent=(countTail*100)/flip;
		System.out.println("TailPercent is "+tailPercent);
		int headPercent=(countHead*100)/flip;
		System.out.println("HeadPercent is "+headPercent);
	
	}
	
	/**Function for check leap year or not leap year
	 * 
	 * @param year
	 * @return
	 */
	public static void leapYear(int year) 
	{
		if(year>999&&year<10000)
		{
			if((year%4==0)&&(year%100!=0)||(year%400==0))
			{
				System.out.println("Leap year");
			}
			else
			{
				System.out.println("not a Leap year");
			}
		}
		else
		{
			System.out.println("Enter Valid Year!");
		}//end else
		 
	}
	
	/**Function for Power Of Two calculation
	 * 
	 * @param number
	 * @param powerofTwo
	 * @return
	 */
	public static int powerofTwo(int number,int powerofTwo) 
	{
		int result=(int) Math.pow(number, powerofTwo);
		return result;
	}
	
	/**Function for Harmonic Number
	 * 
	 * @param number
	 * @return
	 */
	public static int harmonicNumber(int number) 
	{
		for(int i=1;i<number;i++)
		{
			if(number!=1)
			{
				System.out.println("1/"+i+"+");
			}
			else if(number==1)
			{
				System.out.println("1/"+i);
			}
		}
		return number;
	}
	
	/**Function for Prime number
	 * 
	 * @param number
	 * @return
	 */
	public static boolean primeNumber(int number) 
	{
		int temp=number;
		for(int i=2;i<temp/1;i++) 
		{
			if(temp%i==0)
			{
				return false;
			}			
		}
		return true;		
	}
	
	/**Function for Prime Factor
	 * 
	 * @param number
	 * @return
	 */
	public static int primeFactor(int n) 
	{
		int fact=1;
		for( int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	/**Function for gambler Program
	 * 
	 * @param stake
	 * @param goal
	 * @param tries
	 */
	public static void gambler(int stake, int goal, int tries) 
	{
		int win=0;
		 int trails=0;
		 for(int i=0;i<tries;i++) 
		 {
			 int money=stake;
			 while(money>0 && money<goal)
			 {
				 if(Math.random()>0.5) 
				 {
					 money++;
					 trails++;
				 }
				 else 
				 {
				 		money--;
				 		trails++;
				 	}
			 }
			 if(money==goal)
				 win++;	
		 }
		 int won=win*100/tries;
		 int loss=tries-win;
		 int loss1=100-won;
		 System.out.println("Number of times won: "+win);
		 System.out.println("Number of times loose: "+loss);
		 System.out.println("Percentage of win: "+won);
		 System.out.println("Percentage of Loss : "+loss1);
		 System.out.println("Average no of bets made: "+trails/tries);
	}
	
	
	/**Function for generating random numbers
	 * 
	 * @param range
	 * @return
	 */
	public static int randomNumber(int range)
	{
		Random random=new Random();
		return (int) random.nextInt(range)+1;
		
	}
	
	
	/**Function for Sum of Three numbers add to ZERO
	 * 
	 * @param arr
	 */
	public static void sumOfNumberAddToZero(int[] arr) 
	{
		int n=arr.length;
		int count=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=i+2;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"]\n");
						count++;
					}
				}
			}
		}
		System.out.println("Triplet Numbers:" +count);
	}
	
	/**Function for calculate euclidean distance
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static double euclideandistance(int x, int y)
	{
		double distance=Math.pow(x,y);
		return distance;
	}
	/**Functions for calculate elapsed time. 
	 * 
	 */
	static double start=0,stop=0;
	public static void startTime()
	{
		start= System.currentTimeMillis();
		//System.out.println("Start time is: "+start);
	}
	public static void stopTime()
	{
		stop= System.currentTimeMillis();
		//System.out.println("Stop time is: "+stop);
	}
	public static void elapsedTime()
	{
		System.out.println("Elapsed time is :"+(stop-start)/1000);
	}
	/**Function for find the roots of the equation.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static double findDeltaSquareRoot(int a, int b, int c) 
	{
		double delt=((b*b)-(4*a*c));
		double delta=Math.abs(delt);
		return delta;
	}
	/**Function for calculate root1.
	 * 
	 * @param a
	 * @param b
	 * @param delta
	 * @return
	 */
	public static double QuadraticEquation(int a, int b, double delta) 
	{
		double root1,d;
		d=Math.sqrt(delta);
		root1=(-b + d)/(2*a);
		return root1;
	}

	/**Function for calculate root2.
	 * 
	 * @param a
	 * @param b
	 * @param delta
	 * @return
	 */
	public static double QuadraticEquation1(int a, int b, double delta) {
		double root2,d;
		d=Math.sqrt(delta);
		root2=(-b-d)/(2*a);
		return root2;
	}
	
	/**Function for calculate wind chill.
	 * 
	 * @param t
	 * @param v
	 * @return
	 */
	public static double windChill(int t, int v) 
	{
		double x= Math.pow(v, 0.16);
		double w=35.74+(0.6215*t)+(0.4275*t-35.75)*x;
		return w;

	}
	
	/**Function for Permutation String
	 * 
	 * @param str
	 * @param s
	 * @param e
	 */
	public static void FindPermutation(String str,int s, int e)
	{
		if(s==e)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=s;i<=e;i++)
			{
				str=swap(str,s,i);
				FindPermutation(str, s+1, e);
				str=swap(str,s,i);
			}
		}	
	}
	public static String swap(String str, int i,int j)
	{
		char temp;
		
		char[] tempArray=str.toCharArray();
		
		temp=tempArray[i];
		tempArray[i]=tempArray[j];
		tempArray[j]=temp;
		
		return String.valueOf(tempArray);	
	}
	public static boolean checkExpression(String expression) 
	{
		
		return false;
	}	
	
	
	
}

