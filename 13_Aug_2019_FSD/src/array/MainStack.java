package array;

public class MainStack {

	public static void main(String[] args) {
			
		Stackarray stack = new Stackarray(5);
		stack.pushelement(1);
		stack.pushelement(20);
		stack.pushelement(4);
		stack.pushelement(50);
		stack.pushelement(200);
		stack.pushelement(5);
		
		stack.show();
		stack.popelement();
		stack.show();
		stack.popelement();
		stack.show();
		stack.popelement();
		stack.show();
		stack.popelement();
		stack.popelement();
		stack.popelement();
		
		
	}

}
