
public class NewDemo<M>{
	private M data;
	

	public NewDemo(M data) {
		this.data = data;
	}

	public M getData() {
		return data;
	}

	public void setData(M data) {
		this.data = data;
	}
	
	public static void main(String [] args)
	{
		
		NewDemo<String> d1 = new NewDemo<String> ("Hey");
		System.out.println(d1.getData());
		
		NewDemo<Integer> d2 = new NewDemo<Integer>(2000);
		System.out.println(d2.getData());
	}
	
}
