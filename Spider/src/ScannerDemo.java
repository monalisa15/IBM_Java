import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		/*System.out.println("Enter Name:");
		String name = console.next();
		
		String namepattern = "[A-Z][a-z]{3,}";
		System.out.println("Your Name:" +( name.matches(namepattern)?"Valid" : "Invalid"));
		
		System.out.println("Enter Mobile No:");
		String mobile = console.next();
		String mobpattern = "[7-9][0-9]{9}";
		System.out.println("Mobile No is:" +(mobile.matches(mobpattern)? "Valid" : "Invalid"));*/
		
		System.out.println("Enter age:");
		String age = console.next();
		String agepattern = "[0-9]{0,2}";
		System.out.println("Age is:" +(age.matches(agepattern)? "Valid" :" Invalid"));
		
		
		
		
	}

}
