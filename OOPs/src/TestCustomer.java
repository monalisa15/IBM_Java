public class TestCustomer 
{
    public static void main(String[] args)
    {
		Customer C1 = new Customer("Suvam",5000);
		C1.print();
		LoyalCustomer L1 = new LoyalCustomer("Sritam",70000,10);
		L1.print();
		TempCustomer T1 = new TempCustomer("Milan",12000,20);
		T1.print();
	}
}
