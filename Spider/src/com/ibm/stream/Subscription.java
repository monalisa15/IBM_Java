package com.ibm.stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Subscription {
	
	private LocalDate expiry;
	private String plan;
	private static final double MONTHLY=100;
	private static final double ANNUALLY=1000;
	
	public Subscription() {}
	
	public void subscribe(User user, String plan) throws SubscriptionException
	{
		if(plan.equalsIgnoreCase("Monthly") && user.getBalance() >= MONTHLY)
		{
			
			user.setBalance(user.getBalance()-MONTHLY);
			user.setSubscription(this);
			expiry = LocalDate.now().plus(1,ChronoUnit.MONTHS);
			this.plan = plan;
		}
		else if(plan.equalsIgnoreCase("Annually") && user.getBalance() >= ANNUALLY)
		{
			
			user.setBalance(user.getBalance()-ANNUALLY);
			user.setSubscription(this);
			expiry = LocalDate.now().plus(1,ChronoUnit.YEARS);
			this.plan = plan;
		}
		else
			throw new SubscriptionException("Insufficient balance");
		
}
	public String getPlan() {
		return plan;
	}
	
	public LocalDate getExpiry()
	{
		return expiry;
	}
	

}
