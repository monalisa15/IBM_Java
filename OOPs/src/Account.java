import com.ibm.bank.BalanceException;

public abstract class Account {
	private int acntNo;
	private String name;
	protected double balance;
	
	//Application constants
	public static final int INIT_ACNT_NO= 1001;
	public static final double MIN_SAV_BAL = 1000;
	public static final double OD_LIMIT = 10000;
	public static final double INIT_CUR_BAL = 5000;
	public static final double MIN_CUR_BAL = 0;
    private static int autogen = INIT_ACNT_NO;
    
    protected Transaction[] txns;
    protected int idx;
    
	public Account() {}
	
	public Account(String name, double balance) {
		this.acntNo = autogen++;
		this.name = name;
		this.balance = balance;
		
		txns = new Transaction[10];
		txns[idx ++] = new Transaction("0B",balance,balance);
	}
	
	public void Summary()
	{
		System.out.println("Account No:"+acntNo);
		System.out.println("Holder Name:"+name);
		System.out.println("Balance:"+balance);
	}
	
	public void deposit(double amount)
	{
		balance += amount;
		txns[idx ++] = new Transaction("CR",amount,balance);
	}
	
	public  abstract void withdraw(double amount) throws BalanceException;
	
	public void statement()
	{
		System.out.println("Statement For A/C:" +acntNo);
		for(int i=0;i<idx;i++)
			txns[i].print();
	}
	
}
