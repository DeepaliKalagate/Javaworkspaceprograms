package com.bridgelabz.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.datastructureutility.Queue;

public class OOPUtility 
{

	static Scanner scanner=new Scanner(System.in);
	public static String isString()
	{
		String string=scanner.nextLine();
		return string;
	}
	public static int isInt()
	{
		int integer=scanner.nextInt();
		return integer;
	}
	public static long islong()
	{
		long longValue=scanner.nextLong();
		return longValue;
	}
	public static double doubleValue()
	{
		double doubleValue=scanner.nextDouble();
		return doubleValue;
	}
	
	/**
	 * Purpose : Insert the cards in Array.
	 * 
	 * @param arr
	 */
	private static void cardInsert(String[][] arr) 
	{
		String Suits[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String Rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j] = Suits[i] + " " + Rank[j];
			}
		}
	}
	public static String[][] cardDistribute() 
	{
		String arr[][] = new String[4][13];
		cardInsert(arr);
		cardShuffle(arr);

		String playercard[][] = new String[4][9];
		for (int i = 0; i < playercard.length; i++) 
		{
			for (int j = 0; j < playercard[i].length; j++) 
			{
				playercard[i][j] = arr[i][j];
			}
		}
		return playercard;
	}

	
	/**
	 * Purpose: shuffles the card of deck
	 * 
	 * @param arr array of cards
	 * @return returns shuffle array
	 */
	private static void cardShuffle(String[][] arr)
	{
		Random r1 = new Random();
		for (int i = 0; i < 150; i++) 
		{
			int x1 = r1.nextInt(4);
			int x2 = r1.nextInt(13);
			int x3 = r1.nextInt(4);
			int x4 = r1.nextInt(13);
			swap(arr, x1, x2, x3, x4);

		}
	}
	
	
	/**
	 * Purpose : Exchange the cards.
	 * 
	 * @param arr
	 * @param x1
	 * @param x2
	 * @param x3
	 * @param x4
	 */
	private static void swap(String[][] arr, int x1, int x2, int x3, int x4)
	{
		String temp = arr[x1][x2];
		arr[x1][x2] = arr[x3][x4];
		arr[x3][x4] = temp;
	}

	/**Method for Sorting the cards
	 * 
	 * @param playercard
	 * @return
	 */
	public static Queue<Queue<String>> cardSort(String playercard[][]) 
	{
		Queue<Queue<String>> sortedcard = new Queue<>();

		String rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int arr[] = new int[9];
		int index = 0;
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 9; j++)
			{

				String temp[] = (playercard[i][j] + " ").split(" ");
				for (int k = 0; k < 13; k++) 
				{
					if (temp[1].equals(rank[k])) 
					{
						arr[index] = k;
						index++;
					}
				}
			}
			System.out.println();
			index = 0;
			for (int k1 = 0; k1 < arr.length - 1; k1++) 
			{
				for (int k2 = k1 + 1; k2 < arr.length; k2++) 
				{
					if (arr[k1] > arr[k2]) 
					{
						int temp = arr[k1];
						arr[k1] = arr[k2];
						arr[k2] = temp;

						String temp1 = playercard[i][k1];
						playercard[i][k1] = playercard[i][k2];
						playercard[i][k2] = temp1;

					}
				}
			}
		}

		for (int i = 0; i < playercard.length; i++)
		{
			Queue<String> temp = new Queue<>();
			for (int j = 0; j < playercard[i].length; j++)
			{
				Queue.enQueue(playercard[i][j]);
				
			}
			sortedcard.enQueue(temp);
		}
		return sortedcard;
	}

	/**function for printing message using regex.
	 * 
	 * @param fullname
	 * @param mobile
	 * @param string
	 * @return
	 */
	public static String message(String fullname, String mobile, String string)
	{

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String strInput = string;
		String string1 = strInput.replaceAll("<<name>>", firstName);
		String string2 = string1.replaceAll("<<fullname>>", fullname);
		String string3 = string2.replaceAll("xxxxxxxxxx", mobile);
		String string4 = string3.replaceAll("Date", dateFormat.format(date));

		return string4;

	}

}
