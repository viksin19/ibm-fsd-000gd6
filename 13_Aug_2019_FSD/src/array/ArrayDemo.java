<<<<<<< HEAD
package array;

import java.util.Arrays;

public class ArrayDemo {
private char arr[];

public ArrayDemo() {

}

public void creatArray(int length) {
	arr = new char[length];
	for(int i=0;i<arr.length;i++) {
		arr[i]=(char)('A'+i);
	}
}

public char[] getArray() {
	return arr;
}

public void searcelement(int k, int sarr[]) {
	int i = Arrays.binarySearch(sarr, k);
		if(i>=0) {
			System.out.println("Element found");
			return ;
		}else {
	System.out.println("Element Not Found");
		}
}

}
=======
package array;

import java.util.Arrays;

public class ArrayDemo {
private char arr[];

public ArrayDemo() {

}

public void creatArray(int length) {
	arr = new char[length];
	for(int i=0;i<arr.length;i++) {
		arr[i]=(char)('A'+i);
	}
}

public char[] getArray() {
	return arr;
}

public void searcelement(int k, int sarr[]) {
	int i = Arrays.binarySearch(sarr, k);
		if(i>=0) {
			System.out.println("Element found");
			return ;
		}else {
	System.out.println("Element Not Found");
		}
}

}
>>>>>>> 2864f15d73c947a8aec49c905b317c863649166d