import com.ibm.bank.Banking;
import com.ibm.bank.BalanceException;
import com.ibm.bank.AccountFactory;
public class TestAccount{

	public static void main(String[] args) {
		
		
		Banking S1 = AccountFactory.opensavingsAccount("Mona");
	 try {
		S1.withdraw(2000);
	 }
	 catch(BalanceException e)
	 {
		 e.printStackTrace();
	 }
	 }
	             

}
