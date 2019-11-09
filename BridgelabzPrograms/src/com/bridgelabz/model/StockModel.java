package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

import com.bridgelabz.stock.StockInformation;

@SuppressWarnings("serial")
public class StockModel implements Serializable
{
	List<StockInformation> stockInformation;
	//List<StockInformation2>stockInformation2;
	
	public List<StockInformation> getStockInformation() 
	{
		return stockInformation;
	}


	public void setStockInformation(List<StockInformation> stockInformation) 
	{
		this.stockInformation = stockInformation;
	}
	
	@Override 
	public String toString()
	{
		return "StockModel[stockInformation1="+stockInformation+"]";
	}
}
