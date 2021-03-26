
public interface Hello {

	String sayHello();
	 
	default void sayhalo()
	{
		System.out.println("Hello Mona");
	}
	
	static void sayBye()
	{
		System.out.println("Bye Mona");
	}
	
}
class HelloDemo
{
	public static void main(String[] args)
	{
		Hello h = () -> "Hello World";
		System.out.println(h.sayHello());
		
		Hello h2 = () ->
		{
			String msg ="hello Again";
			return msg;
		};
		System.out.println(h2.sayHello());
		h2.sayhalo();
	    Hello.sayBye();
	}
}
