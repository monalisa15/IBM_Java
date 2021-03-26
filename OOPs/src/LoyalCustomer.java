
public class LoyalCustomer extends Customer {
	private double discount;
	public LoyalCustomer(String custName, double creditLimit,double discount) {
		super(custName, creditLimit);
		this.discount = discount;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Discount Given:" + discount);
	}
}
