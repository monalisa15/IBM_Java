import com.ibm.bank.BalanceException;
import com.ibm.bank.Banking;

public class Savings extends Account implements Banking {
	public Savings() {}

	public Savings(String name) {
		super(name,MIN_SAV_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
	   if(amount <= (balance-MIN_SAV_BAL)) {
		   balance =- amount;
		   txns[idx ++] = new Transaction("DR",amount,balance);
	   }
	   else
		    System.out.println("Insufficient Balance");
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		
	}
	

}
