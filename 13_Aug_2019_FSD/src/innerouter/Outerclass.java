<<<<<<< HEAD
package innerouter;

public class Outerclass {

	private int x,y;
	public Outerclass() {
		
	}
	public Outerclass(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public void outermethod() {
		System.out.println("Outer Method : "+x+" "+y+" ");
	}

	public class Innerclass{
		public void innermethod() {
			x=10;
			y=20;
			outermethod();
			System.out.println("Inner Method : "+x+" "+y+" ");
			
		}
	}
	
}
=======
package innerouter;

public class Outerclass {

	private int x,y;
	public Outerclass() {
		
	}
	public Outerclass(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public void outermethod() {
		System.out.println("Outer Method : "+x+" "+y+" ");
	}

	public class Innerclass{
		public void innermethod() {
			x=10;
			y=20;
			outermethod();
			System.out.println("Inner Method : "+x+" "+y+" ");
			
		}
	}
	
}
>>>>>>> 2864f15d73c947a8aec49c905b317c863649166d
