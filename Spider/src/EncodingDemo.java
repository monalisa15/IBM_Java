import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

public class EncodingDemo {
	
	public static void main(String[] args)
	{
		String password = "pass@word";
		System.out.println(password);
		
		Encoder encoder = Base64.getEncoder();
		String encodedpwd = encoder.encodeToString(password.getBytes());
		System.out.println(encodedpwd);
		
		Decoder decoder = Base64.getDecoder();
		String decodedpwd = new String(decoder.decode(encodedpwd.getBytes()));  
		System.out.println(decodedpwd);
		
				
		}

}
