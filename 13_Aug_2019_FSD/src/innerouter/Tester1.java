<<<<<<< HEAD
package innerouter;

import innerouter.Model.Square;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		model.modelmethod();
		Model.Square square = model.new Square();
		square.area(10, 10);
		Square.Rectangle rec = square.new Rectangle();
		rec.recarea(5, 6);


	}
	

}
=======
package innerouter;

import innerouter.Model.Square;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		model.modelmethod();
		Model.Square square = model.new Square();
		square.area(10, 10);
		Square.Rectangle rec = square.new Rectangle();
		rec.recarea(5, 6);


	}
	

}
>>>>>>> 2864f15d73c947a8aec49c905b317c863649166d
