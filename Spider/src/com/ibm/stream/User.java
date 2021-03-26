package com.ibm.stream;

public class User {

	private String name;
	private int age;
	private String gender;
	private double balance;
	private Subscription subscription;
	
	private void Profile()
	{
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Gender:" +gender);
		System.out.println("Subscription:" +subscription.getPlan());
		
	}
	
	private Subscription mySubscription()
	{
		return subscription;
	}
	
	public User() {}
	
	public User(String name, int age, String gender, double balance) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public int getAge() {
		return age;
	}
	
	
	
}
