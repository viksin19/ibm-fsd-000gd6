package syncThread;

public class ConsumerStack implements Runnable {
	
	private MyStack mystack;

	public ConsumerStack(MyStack mystack) {
		super();
		this.mystack = mystack;
	}
	
	@Override
	public void run() {
		for(int j=0;j<26;j++) {
		try {
			mystack.pop();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	}

}
