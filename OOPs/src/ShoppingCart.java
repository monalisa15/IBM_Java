import com.ibm.shop.Payment;

public class ShoppingCart {
	private double cartTotal;
	private Product[] items;
	private int idx;
	 public ShoppingCart()
	 {
		 items = new Product[5];
	 }
     
	 public void addProduct(Product p)
	 {
		 if(idx < items.length)
		 {
			 items[idx ++] =p;
			 cartTotal += p.getPrice();
		 }
		 else
			 System.out.println("Your Cart is full");
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
	 }          
}
