import com.ibm.stream.AgeRestrictionException;
import com.ibm.stream.Movie;
import com.ibm.stream.Series;
import com.ibm.stream.Subscription;
import com.ibm.stream.SubscriptionException;
import com.ibm.stream.User;

public class TestStream {

	public static void main(String[] args) {
		
		Subscription sub = new Subscription();
		User u1 = new User("Mona",24, "Female",4000);
		User u2 = new User("Minu", 65, "Female", 5000);
		User u3 = new User("Suvam", 8,"Male", 60);
		
		Movie m1 = new Movie("WAR","Action",false);
		Movie m2 = new Movie("Evil Dead", "Horror",true);
		Movie m3= new Movie("Hangover","Erotic",false);
		
		Series s1 = new Series("XYZ","Action",false,4,9);
	    System.out.println(u2.getBalance());
	    try {
	    	sub.subscribe(u3, "Monthly");
	    	m3.play(u3);
	    }catch(SubscriptionException e)
	    {
	    	e.getMessage();
	    } catch (AgeRestrictionException e) {
			e.getMessage();
		}
	    
	}

}
