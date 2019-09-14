package model.example;

public class Line extends Model {
   private int startpoint,endpoint;
   
   
	public Line(int startpoint, int endpoint) {

	this.startpoint = startpoint;
	this.endpoint = endpoint;
}

	public int getStartpoint() {
	return startpoint;
}

public void setStartpoint(int startpoint) {
	this.startpoint = startpoint;
}

public int getEndpoint() {
	return endpoint;
}

public void setEndpoint(int endpoint) {
	this.endpoint = endpoint;
}

public int calculate() {
	return getEndpoint() - getStartpoint();
}

	@Override
	public boolean isGreater(Object obj1, Object obj2) {
	  
		Line l1 = (Line)obj1;
		Line l2 = (Line)obj2;
		return l1.calculate() > l2.calculate();
	}

	@Override
	public boolean isLess(Object obj1) {
		// TODO Auto-generated method stub

		Line l1 = (Line)obj1;
		
		return l1.calculate() > this.calculate();
	}

	@Override
	public boolean isEqual(Object obj1) {
		// TODO Auto-generated method stub

		Line l1 = (Line)obj1;
		return   this.calculate()== l1.calculate();
	}

}
