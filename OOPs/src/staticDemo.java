
public class staticDemo {
	private int data;
	private static int count;
	public staticDemo(int data) {
		this.data = data;
		count++;
	}
	public void print()
	{
		System.out.println("DATA:" +data +"\t Count:"+count);
	}
public static void main(String[] args) {
	staticDemo d1 = new staticDemo(100);
	d1.print();
	staticDemo d2= new staticDemo(200);
	staticDemo d3 = new staticDemo(300);
	d2.print();
	d3.print();

	}

}
