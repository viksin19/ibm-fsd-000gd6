package meassagingexample;

public class Messagemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Meassaging m = Meassaging.createobject();
		System.out.println(m); // it will call m.toString;
		
		Meassaging m1= Meassaging.createobject("Hello");
		System.out.println(m==m1);
		System.out.println(m1);
	}

}


