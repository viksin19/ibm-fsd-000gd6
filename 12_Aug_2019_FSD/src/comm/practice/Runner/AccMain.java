package comm.practice.Runner;

public class AccMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(123456789,5600,"Vikram","saving");
		Account acc2 = new Account(123456789,5600,"Vikram","Current");
		
		System.out.println(acc1.equals(acc2));

	}

}
