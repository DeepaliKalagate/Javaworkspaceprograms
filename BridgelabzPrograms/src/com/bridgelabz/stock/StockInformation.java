package com.bridgelabz.stock;

import java.io.Serializable;

public class StockInformation
{
	String name;
	double number;
	double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "StockInformation1 [name=" + name + ", number=" + number + ", price=" + price + "]";
	}
	
}
