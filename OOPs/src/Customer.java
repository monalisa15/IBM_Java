public class Customer {

 private int custId;
 private String custName;
 private double creditLimit;
 private static int autogen;
 static {
	 autogen = 2001;
 }
public Customer(String custName, double creditLimit) {
	this.custId = autogen++;
	this.custName = custName;
	this.creditLimit = creditLimit;
}
 public void print()
 {
	 System.out.println("Customer Id:"+custId);
	 System.out.println("Customer Name:"+custName);
	 System.out.println("Credit Limit:"+creditLimit);
 }

	

}
