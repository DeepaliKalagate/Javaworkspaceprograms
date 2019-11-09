package com.bridgelabz.oops.stockaccount;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;



public class Controller implements StockInterface
{
	ObjectMapper mapper = new ObjectMapper();
	Shares stockDetail = new Shares();
	StockReport sharesList = new StockReport();
	List<Shares> localList = new ArrayList<Shares>();
	StackUtility<String> symbolTransaction = new StackUtility<String>();
	QueueUtility<String> timeOfTransaction = new QueueUtility<String>(); 
	File file ;
	File folder = new File("/home/admin1/eclipse-workspace/CommercialDataProcessing/src/com/bridgelabz/files");
	Scanner sc = new Scanner(System.in);
	
	
	/**Method for Create customer to Buy and Sell stocks.
	 * 
	 */
	public void stockAccount(String newFile) throws JsonParseException, JsonMappingException, IOException
	{
		File folder = new File("/home/admin1/eclipse-workspace/CommercialDataProcessing/src/com/bridgelabz/files");
		File newfile = new File(folder+"/"+newFile+".json");
		if(newfile.createNewFile())
		{
			System.out.println("New File created in workspace directory");
		}
		else
		{
			System.out.println("File already exist");
		}
	}
	
	/**Opening file to do transactions
	 * 
	 * @param openfile
	 */
	public void openFile(String openfile)
	{
		 file = new File(folder+"/"+openfile+".json");
		if(file.exists())
		{
			System.out.println("File opened");
		}
		else
		{
			System.out.println("No file with this name");
		}
		
	}
	
	/**Customer buying the shares so balance reduce n number of share.
	 * 
	 */
	public void buy(int amount, String symbol) throws JsonGenerationException, JsonMappingException, IOException
	{
		int counter = 0,i;
		LocalDateTime now  = LocalDateTime.now();
		String date= now.toString();
		
		if(file.length() != 0)
		{
			sharesList = mapper.readValue(file, StockReport.class);
			localList.addAll(sharesList.getSharesList());
			try 
			{
				for(i=0;i<localList.size();i++)
				{
					if(sharesList.getSharesList().get(i).getStockSymbol().equals(symbol))
					{
						int currentShare = sharesList.getSharesList().get(i).getNumberOfShares();
						int add = currentShare+amount; 
						sharesList.getSharesList().get(i).setNumberOfShares(add);
						mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
						counter++;
						localList.clear();
						symbolTransaction.push(symbol.concat("-").concat("Bought"));
						timeOfTransaction.enqueue(date.concat("-"+symbol+"-Bought"));
					}
				}
			}
			catch (Exception e)
			{}
		}

		if(counter == 0 || file.length() == 0)
		{
			stockDetail.setNumberOfShares(amount);
			stockDetail.setStockSymbol(symbol);
			stockDetail.setTimeOfTransaction(date);
			localList.add(stockDetail);
			sharesList.setSharesList(localList);
			mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
			localList.clear();
			symbolTransaction.push(symbol.concat("-").concat("Bought"));
			timeOfTransaction.enqueue(date.concat("-"+symbol+"-Bought"));
		}
	}

	/**selling shares so balance increses and number of shares of
	 * user decreses and companys count share increses.
	 * 
	 */
	public void sell(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException
	{
		LocalDateTime now  = LocalDateTime.now();
		String date= now.toString();
		if(file.length() != 0)
		{
			sharesList = mapper.readValue(file, StockReport.class);
			localList.addAll(sharesList.getSharesList());
			try 
			{
				for(int i=0;i<localList.size();i++)
				{
					if(sharesList.getSharesList().get(i).getStockSymbol().equals(symbol))
					{
						int currentShare = sharesList.getSharesList().get(i).getNumberOfShares();
						int deducted = currentShare-amount;
						sharesList.getSharesList().get(i).setNumberOfShares(deducted);
						mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
						symbolTransaction.push(symbol.concat("-"+"Sold"));
						timeOfTransaction.enqueue(date.concat("-"+symbol+"sold"));
					}
					else if(i==localList.size()-1)
					{
						System.out.println("No shares with this Symbol");
					}
				}
				
			}
			catch(Exception e)
			{}
		}
		else
		{
			System.out.println("No data in StockAccount");
		}	
	}
	
	/**Calculating total value of shares
	 * 
	 */
	public void valueOf() throws JsonParseException, JsonMappingException, IOException
	{
		int total = 0;
		if(file.length()!=0)
		{
			sharesList = mapper.readValue(file, StockReport.class);
			localList.addAll(sharesList.getSharesList());
			try {
			for(int i=0;i<localList.size();i++)
			{
				total = total+sharesList.getSharesList().get(i).getNumberOfShares();
			}
			}
			catch(Exception e) {}
			System.out.println("Total value of shares in Account is "+total);
		}
	}
	
	/**Print the transaction.
	 * 
	 */
	public void printReport() throws JsonParseException, JsonMappingException, IOException
	{
		if(file.length()!=0)
		{
			sharesList = mapper.readValue(file, StockReport.class);
			localList.addAll(sharesList.getSharesList());
			System.out.println("-------------STOCK REPORT-------------");
			try {
			for(int i=0;i<localList.size();i++)
			{
				String symbol = sharesList.getSharesList().get(i).getStockSymbol();
				System.out.println("Stock Symbol: "+symbol);
				int amount =sharesList.getSharesList().get(i).getNumberOfShares();
				System.out.println("Number of Shares: "+amount);
				System.out.println("--------------------------------------");
			}}
			catch(Exception e){}
		}
			
	}
	
	/**Removing shares from account
	 * 
	 */
	public void removeShare(String symbol) throws JsonParseException, JsonMappingException, IOException
	{
		LocalDateTime now  = LocalDateTime.now();
		String date= now.toString();
		int i;
		if(file.length() != 0)
		{
			sharesList = mapper.readValue(file, StockReport.class);
			localList.addAll(sharesList.getSharesList());
			try
			{
				for(i=0;i<localList.size();i++)
				{
					if(sharesList.getSharesList().get(i).getStockSymbol().equals(symbol))
					{
						sharesList.getSharesList().remove(i);
						mapper.writerWithDefaultPrettyPrinter().writeValue(file, sharesList);
						System.out.println("Stock with Symbol "+symbol+" Removed");
						symbolTransaction.push(symbol.concat("-").concat("Removed"));
						timeOfTransaction.enqueue(date.concat("-".concat(symbol).concat("-removed")));
					}
				}
			} catch (Exception e) {}
		}
		else
		{
			System.out.println("Stock Report Empty");
		}
	}
	
	/**Displaying the all Transactions using Stack
	 * 
	 */
	public void showTransaction()
	{
		symbolTransaction.showFullStack();
		System.out.println();
	}
	
	/**Displaynig the Date and Time of all Transactions.
	 * 
	 */
	public void timeOfTransaction()
	{
		timeOfTransaction.showFullQueue();
		System.out.println();
	}
	
	
	
}
