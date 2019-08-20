package comm.product;

public class Product {
	private static int productcount;
	private int currentrate;
	private static final int TAX; //blank final variable
	static {
		productcount = 0;
		TAX = 10; // now it is assigned so it is not blank final value
	}
	
	public Product() {
		
	}
	public Product(int currentrate) {
		productcount++;
		this.currentrate = currentrate;
	}
	
	public static int getproductcount() {
		return productcount;
	}
	public String getDetails() {
		return " || CurrentRate : "+currentrate+" || Tax : "+TAX;
	}
	

}
