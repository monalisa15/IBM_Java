package com.ibm.shop;

public class ShoppingCart {
	private double cartTotal;
	private Product[] items;
	private int idx;
	String [][] coupons = {{"HOLI200","200"},{"WKND100","100"},{"APRIL150","150"}};
	 public ShoppingCart()
	 {
		 items = new Product[5];
	 }
     
	 public void addProduct(Product p) throws OutOfStockException
	 {
		 if(idx < items.length)
		 {
			 items[idx ++] =p;
			 cartTotal += p.getPrice();
		 }
		 else
			 throw new  OutOfStockException("Your Cart is full");
	 }
	 public void checkOut(Payment pmt, String code)
	 {
		 if(idx ==0)
			 System.out.println("Your Cart is empty!!");
		 else {
			 for(int i=0;i<idx;i++)
			 System.out.println(items[i].getPname());
		 }
		 System.out.println("Cart Total:" +cartTotal);
		 if(pmt.getBalance() < cartTotal)
			 System.out.println("Insufficient Balance");
		 else 
		 {
			
			 
		 }
	 }
}
