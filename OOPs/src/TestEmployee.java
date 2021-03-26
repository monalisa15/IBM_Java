public class TestEmployee
{
	public static void main(String[] args)
	{
		Manager M1= new Manager("Mona",10000,5000);
		Executive E1 = new Executive("Snigdha",12000,2500);
		showsalary(M1);
		showsalary(E1);
	}
	//Polymorphic Method
     private static void showsalary(Employee emp)
     {
    	 if(emp instanceof Manager) //Run time identification
    		 System.out.println("Manager Salary:" +emp.getSalary());
    	 else
    		 System.out.println("Executive Salary:"+emp.getSalary());
    	 
     }
	/*private static void showsalary(Executive e1) {
		System.out.println("Executive salary:" + e1.getSalary());
	}

	private static void showsalary(Manager m1) {
		System.out.println("Manager Salary:"+ m1.getSalary());
	}*/
}
