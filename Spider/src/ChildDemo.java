
public class ChildDemo<M, A> extends NewDemo<M> {
	
	private A temp;

	public ChildDemo(M data , A temp) {
		super(data);
		this.temp = temp;
	}

	public A getTemp() {
		return temp;
	}

	public void setTemp(A temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args)
	{
		ChildDemo<Integer,String> c1= new ChildDemo<Integer,String> (1000,"Mona");
		System.out.println(c1.getTemp()+ " " +c1.getData());
	}

}
