package com.ibm.bank;

public final class AccountFactory {
	
    private AccountFactory() {}
	public static Banking opensavingsAccount(String name)
	{
		return new Savings(name);
	}
	
	public static Banking openCurrentAccount(String name)
	{
		return new Current(name);
	}
}
