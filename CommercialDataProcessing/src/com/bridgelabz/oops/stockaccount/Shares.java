package com.bridgelabz.oops.stockaccount;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCreation;

public class Shares 
{
	private String stockSymbol;
	private int numberOfShares;
	private String timeOfTransaction;
	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public String getTimeOfTransaction() {
		return timeOfTransaction;
	}
	public void setTimeOfTransaction(String date) {
		this.timeOfTransaction = date;
	}
	
	
	
}
