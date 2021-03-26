
public class TestCurrency {

	public static void main(String[] args) {
	
		INR inr = new INR();
		AED aed = new AED();
		CurrencyCoverter c= new CurrencyCoverter();
	    System.out.println(c.convert(inr, aed, 100));
		

	}

}
