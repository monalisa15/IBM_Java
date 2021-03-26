import com.ibm.bank.BalanceException;

public class Current extends Account {

	public Current() {}
     public double overdraft;
     public Current(String name) {
		super(name, 5000);
		overdraft = 10000;
	}
     
	@Override
	public void deposit(double amount) {
			overdraft += amount;
			if(overdraft>10000)
			{
				balance += overdraft - 10000;
				overdraft = 10000;
			}
	}
	
	@Override
	public void withdraw(double amount) throws BalanceException {
	    if(amount <= (balance + overdraft))
	    {
	    	balance -=amount;
	    	if (balance <0)
	    	{
	    		overdraft +=balance;
	    		balance =0;
	    	}
	    }
	    else
	    	System.out.println("Insufficient balance");
	}
	
	@Override
	public void Summary() {
		// TODO Auto-generated method stub
		super.Summary();
		System.out.println("Overdraft:" +overdraft);
	}
     

}
