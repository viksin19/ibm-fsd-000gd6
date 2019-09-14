package threaddemo;

public class MythreadDemo1 implements Runnable {
public static void main(String[] args) {
	MythreadDemo1 mythread = new MythreadDemo1();
	Mythread2 mythread2 = new Mythread2();
	Thread t1 = new Thread(mythread);
	Thread t2 = new Thread(mythread2);
	t1.start();
	System.out.println("status of thread 1 : "+t1.isAlive());
	t2.start();
	try {
		t1.join();
	}catch (InterruptedException e) {
		
	}
	System.out.println("status of thread 1 : "+t1.isAlive());
	System.out.println("status of thread 2 : "+t2.isAlive());
}

@Override
public void run() {
	
	try {

		for(int i=0;i<16;i++) {
			System.out.print(" i >> "+i);
			if(i==10) {
				Thread.sleep(3000);
				
			}
		}
	}catch(Exception e) {
		
	}
}
}
