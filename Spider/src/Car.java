
public class Car {
	
	private String model;
	private String[] features;
	public Car(String model, String... features) //varArgs
	{
		this.model = model;
		this.features = features;
	}
	
	public void specs()
	{
		System.out.println("Features of:" +model);
		for(String f : features)
			System.out.println(" > " +f);
	}
	
	public static void main(String[] args)
	{
		//String [] falto = {"Keyless", "Power Steering", "AC"};
		Car alto = new Car("Suzuki Alto","Keyless", "Power Steering", "AC","Air Bags");
		
		//String [] fhector = {"ABS", "Moon roof", "Climate Control"};
		Car hector = new Car("MG Hector","ABS", "Moon roof", "Climate Control");
		
		alto.specs();
		hector.specs();
	}

}
