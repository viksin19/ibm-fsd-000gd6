package meassagingexample;

public class Meassaging {

	private static String meassage;
    private static Meassaging message;
    
    
	private Meassaging() {
		
	}


	private Meassaging(String meassage) {
	
	this.meassage = meassage;
	}
	
	
	
	public static void setMessage(String message) {
		meassage = message;
	}


	public static Meassaging createobject() {
		if(message == null) {
			
			message = new Meassaging();
		}
		return message;
	}
	
	public static Meassaging createobject(String mess) {
		if(message == null) {
			message = new Meassaging(mess);
		
		return message;
	}else {
		Meassaging.setMessage(mess);
		return message;
	}
	}

	@Override
	public String toString() {
		return "Meassaging [meassage=" + meassage + "]";
	}
	
	
	
}
