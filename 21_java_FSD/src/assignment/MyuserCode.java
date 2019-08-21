package assignment;

public class MyuserCode {
  
	
   private static final String ipattern = "((?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]))";
   
	public  void checkpassword(String password) {
		if(password.length()==8 && password.matches(ipattern) ) {
		System.out.println(" Validated!!!");
		}else {
			System.out.println("Invalid password....");
		}
	}
	
}
