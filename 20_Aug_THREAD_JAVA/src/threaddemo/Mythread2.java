package threaddemo;

public class Mythread2 implements Runnable {
@Override

public void run() {
	for (int j=0;j<16;j++) {
		System.out.println("j >>"+j);
		if(j==10) {
			Thread.yield();
		}
	}
}
}
