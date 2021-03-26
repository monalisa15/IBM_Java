package com.ibm.shop;

public class Product {
	private String pname;
	private double price;
	private int stock;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product() {}
	public Product(String pname, double price, int stock)
	{
		this.pname = pname;
		this.price = price;
		this.stock = stock;
		
	}

}
