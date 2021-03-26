import com.ibm.shop.Payment;

public class TestShopping {

	public static void main(String[] args) {
	   Product P1 =new Product("Glass",50000);
	   Product P2 = new Product("Flower",700);
	   Payment pmt = new Payment("16521",8000);
	   ShoppingCart S = new ShoppingCart();
	   S.addProduct(P1);
	   S.addProduct(P2);
	   S.checkOut(pmt,"APRIL150");

	}

}
