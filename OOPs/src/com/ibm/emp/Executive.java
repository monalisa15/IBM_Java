package com.ibm.emp;

public class Executive extends Employee {

	private double commissions;
	public Executive() {}

	public Executive(String empname, double salary,double commission) {
		super(empname, salary);
		this.commissions = commission;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commissions;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Commission:"+commissions);
	}

}
