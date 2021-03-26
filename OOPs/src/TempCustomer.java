
public class TempCustomer extends Customer {
    private double discount;
	public TempCustomer(String custName, double creditLimit,double discount) {
		super(custName, creditLimit);
		this.discount = discount;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Discount given:" +discount);
	}
   
}
