package innerouter;

public class Model {
private int x,y;

public Model() {

}

public Model(int x, int y) {
	this.x = x;
	this.y = y;
}

public void modelmethod() {
	System.out.println("Model Method : "+x+" "+y+" ");
}

public class Square{
	public void area(int a,int b) {
		x=a;
		y=b;
		System.out.println("Area of Square : "+x*y+" ");
		modelmethod();
	}
	
	public class Rectangle{
		
		public void recarea(int i,int j) {
		       x =i;
		      y = j;
		      
		      System.out.println("Rectangle : "+x*y);
		      modelmethod();
		}
	}
	
}
}
