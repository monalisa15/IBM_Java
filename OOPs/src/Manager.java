
public class Manager extends Employee {
    private double incentive;
	public Manager() {
		super();
	}

	public Manager(String empname, double salary,double incentive) {
		super(empname, salary);
		this.incentive = incentive;
	}
	
    @Override
	public double getSalary() {
		return super.getSalary() + incentive;
	}
    @Override
	public void payslip() {
		super.payslip();
		System.out.println("Incentives:" +incentive);
	}
}
