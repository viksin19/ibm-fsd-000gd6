<<<<<<< HEAD
package array;

public class Stackarray {
   
	private int[] arr;
	private static int stacksize;
	private static int top;
	
	
	public Stackarray(int s) {
	this.stacksize = s;
	this.arr = new int[stacksize];
	top=-1;
	}


	public void pushelement(int ele) {
		if(top==stacksize-1) {
			System.out.println("Stack Overflow");
			
		}else {
			this.arr[++top]=ele;
			System.out.println("Element pushed : "+ele);
		}
	}
	
	public void popelement() {
		if(top<0) {
			System.out.println("Stack UnderFlow");
		}else {
			System.out.println(" Element Poped : "+this.arr[top--]);
		}
	}
	
	public void show() {
		System.out.print("Stack Element : ");
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
=======
package array;

public class Stackarray {
   
	private int[] arr;
	private static int stacksize;
	private static int top;
	
	
	public Stackarray(int s) {
	this.stacksize = s;
	this.arr = new int[stacksize];
	top=-1;
	}


	public void pushelement(int ele) {
		if(top==stacksize-1) {
			System.out.println("Stack Overflow");
			
		}else {
			this.arr[++top]=ele;
			System.out.println("Element pushed : "+ele);
		}
	}
	
	public void popelement() {
		if(top<0) {
			System.out.println("Stack UnderFlow");
		}else {
			System.out.println(" Element Poped : "+this.arr[top--]);
		}
	}
	
	public void show() {
		System.out.print("Stack Element : ");
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
>>>>>>> 2864f15d73c947a8aec49c905b317c863649166d