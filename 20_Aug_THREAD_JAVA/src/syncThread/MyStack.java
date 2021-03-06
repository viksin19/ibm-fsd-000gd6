package syncThread;

public class MyStack {
	private static int index = -1;
    private static final int MAX=26;
	char[] product = new char[MAX];
	public synchronized void push(char item) throws InterruptedException {
		if(index == MAX-1) {
			System.out.println("Producer is full...");
			wait();
		}
		product[++index]=item; 
		System.out.println("push : "+item);
		  notify();
		   
	}
	
	public synchronized void pop() throws InterruptedException {
		if(index== -1) {
			System.out.println("Consumer is Empty...");
			wait();
		}
			System.out.println("pop: "+product[index--]);
			notify();
		
	}
}
