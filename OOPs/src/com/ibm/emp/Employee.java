package com.ibm.emp;

public class Employee {

	private int empId;
	private String empname;
	private double salary;
	private static int autogen;
	static {
		System.out.println("Employee class ready.....");
		autogen = 1001;
	}
	public Employee() {}
	public Employee(String empname, double salary) {
		this.empId = autogen++;
		this.empname = empname;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void payslip()
	{
		System.out.println("EmpID:" + empId);
		System.out.println("Emp Name:" + empname);
		System.out.println("Salary:"+salary);
	}
}
