package comm.product;

public class Productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = null;
		p = new Television("Sony",2000);
		System.out.println(p.getClass().getName());
		System.out.println(p.getDetails());
		
		p= new Book("The Ramayan");
		System.out.println(p.getClass().getName());
		System.out.println(p.getDetails());
		
		

	}

}
