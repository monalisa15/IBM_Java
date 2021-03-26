package com.ibm.xe;

public class CurrencyCoverter {
	
	public double convert(Currency source, Currency target, double amount)
	{
   
		double rate = target.dollarvalue()/source.dollarvalue();
		return rate * amount;

 	}

}
