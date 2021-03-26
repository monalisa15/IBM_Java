
public class Demo {

	private Object Data;
	
	public Demo(Object data) {
		this.Data = data;
	}

	public Object getData() {
		return Data;
	}

	public void setData(Object data) {
		this.Data = data;
	}
	
	public static void main(String [] args)
	{
		Demo d = new Demo(20);
		System.out.println(d.getData());
		d.setData("Mona");
		System.out.println(d.getData());
		String [] ar = {"10","2"};
		d.setData(ar[1]);
		System.out.println(d.getData());
		
	}
	
}
