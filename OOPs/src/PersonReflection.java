import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class PersonReflection {

	public static void main(String[] args) throws Exception {
		 
		//Person p= new Person("Mona",25);
		// Class pc = p.getClass();
		 Class pc = Class.forName("Person");
		 System.out.println(pc.getName());
		 
		 Constructor[] constructors = pc.getConstructors();
		 System.out.println("list of constructors");
		 for(Constructor c : constructors)
			 System.out.println(c);
		 
		 Method[]  methods = pc.getMethods();
		 System.out.println("list of Methods");
		 for(Method m : methods)
			 System.out.println(m);

		 Method[] decmethods = pc.getDeclaredMethods(); 
		 System.out.println("list of Methods");
		 for(Method m : decmethods)
			 System.out.println(m);
		 
		 java.lang.reflect.Field[] fields = pc.getDeclaredFields();
		 System.out.println("LIST OF FIELDS");
		 for(java.lang.reflect.Field f :fields)
			 System.out.println(f);
		 
	}

}
