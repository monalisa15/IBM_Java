import java.util.regex.*;

public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String email = "zubair@mail.com";
      int iat = email.indexOf('@');
      int idot = email.indexOf('.');
      if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && iat >3 && idot > iat+3 && email.length() > idot +2)
    	  System.out.println("Email is valid");
      else
    	  System.out.println("Email is invalid");
      }
	
	

}
