package com.bridgelabz.oops.stockaccount;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;



public class MainCommercialData 
{

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		Scanner sc = new Scanner(System.in);
		Controller control = new Controller();
		File file = new File("/home/admin1/eclipse-workspace/CommercialDataProcessing/src/com/bridgelabz/files/Account.json");
		int choice=1;
		while(choice > 0 && choice < 10)
		{
			System.out.println("=================Welcome to StockAccount============\n");
			System.out.println("Select Option\n"
					+ "1.Create new Account from file\n"
					+ "2.Open File\n"
					+ "3.Calculate total value of account\n"
					+ "4.Buy shares and add to account\n"
					+ "5.Sell shares\n"
					+ "6.Print Report of Account\n"
					+ "7.Remove Share\n"
					+ "8.Show Transaction\n"
					+ "9.Show time of Transactions\n"
					+ "10.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter Name of File");
				String newFile = sc.next();
				control.stockAccount(newFile);
				break;
			}
			
			case 2:
			{
				System.out.println("Enter name of file");
				String fileName = sc.next();
				control.openFile(fileName);
				break;
			}
			
			case 3:
			{
				control.valueOf();
				break;
			}
			
			case 4:
			{
				System.out.println("Enter amount of shares");
				int amount = sc.nextInt();
				System.out.println("Enter Stock Symbol");
				String symbol = sc.next();
				control.buy(amount ,symbol);
				System.out.println("Successfully updated");
				break;
			}
			
			case 5:
			{
				System.out.println("Enter Stock Symbol");
				String symbol = sc.next();
				System.out.println("Enter amount of shares to sell of "+symbol);
				int amount = sc.nextInt();
				control.sell(amount,symbol);
				System.out.println("Successfully updated");
				break;
			}
			
			case 6:
			{
				control.printReport();
				break;
			}
			
			case 7:
			{
				System.out.println("Enter Symbol of share to remove from report");
				String symbol = sc.next();
				control.removeShare(symbol);
				break;
			}
			
			case 8:
			{
				control.showTransaction();
				System.out.println();
				break;
			}
			
			case 9:
			{
				control.timeOfTransaction();
				System.out.println();
				break;
			}
			}
		}
	}
}
