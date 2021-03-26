package com.ibm.bank;

public class Current extends Account {

	public Current() {}
     public double overdraft = OD_LIMIT;
     public Current(String name) {
		super(name, INIT_CUR_BAL);
	}
     
	@Override
	public void deposit(double amount) {
			overdraft += amount;
			if(overdraft > OD_LIMIT)
			{
				balance += overdraft - OD_LIMIT;
				overdraft = OD_LIMIT;
			}
	}
	
	@Override
	public void withdraw(double amount) throws BalanceException {
	    if(amount <= (balance + overdraft))
	    {
	    	balance -=amount;
	    	if (balance < MIN_CUR_BAL)
	    	{
	    		overdraft +=balance;
	    		balance = MIN_CUR_BAL;
	    	}
	    }
	    else
	    	throw new BalanceException("Insufficient balance");
	}

}
