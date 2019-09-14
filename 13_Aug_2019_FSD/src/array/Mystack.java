package array;
import java.util.Stack;
public class Mystack {
private Stack stack;

public Mystack(int size) {
	stack = new Stack();
	stack.setSize(size);
}
public void mystackpush(int item) {
	if(stack.size()==10) {
		System.out.println("Stack is OverFlow !!");
	}else {
		stack.push(item);
		System.out.println("Element Pushed : "+item);
		
	}
}

}
