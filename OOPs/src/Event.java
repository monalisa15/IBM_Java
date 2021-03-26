
public interface Event {
	
	void doSomething();
}
class EventImpl implements Event
{

	@Override
	public void doSomething() {
		System.out.println("First Task");
		
	}
	 static class InnerEventImpl implements Event
	{
		public void doSomething()
		{
			System.out.println("Second task");
		}
	}
	 public void OnemoreImpl()
	 {
		 class NestedEventImpl implements Event
		 {

			@Override
			public void doSomething() {
				System.out.println("Third task");
				
			}
			 
		 }
		 new NestedEventImpl().doSomething();
	 }
	 public void OnelastImpl()
	 {
		 Event e = new Event() //Annonymous inner class
				 {

					@Override
					public void doSomething() {
					    System.out.println("Fourth Class");
						
					}
			 
				 };
				 e.doSomething();
	 }
	 public void pakkalastImpl()
	 {
		 Event e = () -> System.out.println("Fifth task"); //Lambda Expression
		 e.doSomething();
	 }
	public static void main(String[] args)
	{
		EventImpl ei = new EventImpl();
		ei.doSomething();
		
		//InnerEventImpl inner = ei.new InnerEventImpl(); //NON STATIC INNER CLASS
		EventImpl.InnerEventImpl inner = new EventImpl.InnerEventImpl(); //Static inner class
		inner.doSomething();
		
		ei.OnemoreImpl();
		ei.OnelastImpl();
		ei.pakkalastImpl();
	}
	
}
