
public class Person {
		private String name;
		private int age;
		public Person() {
			this("Anonymous", -1);
		}
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public void print()
		{
			System.out.println("NAME:"+name+ "\nAGE:"+age);
		}
		
	 @Override
		public String toString() {
			// TODO Auto-generated method stub
			return "NAME:"+name+ "\nAGE:"+age;
		}
	 
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person)
		{
			Person p= (Person) obj;
			if(p.name.equals(this.name) && p.age == this.age)
				return true;
		}
		return false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stu
		System.out.println("Person is no more");
	}
	public static void main(String[] args)
	 {
		/* Person p1 = new Person("Mona" , 23);
	     System.out.println(p1.hashCode());
	     System.out.println(p1.toString());
	     Person p2 = new Person("Lili",25);
	     System.out.println(p1.equals(p2));*/
		Person p=null;
		for(int i=1;i<=5;i++)
			p = new Person();
		System.gc();
	 }

}
