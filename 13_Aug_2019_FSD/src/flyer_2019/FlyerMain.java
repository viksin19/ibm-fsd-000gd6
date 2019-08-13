package flyer_2019;

public class FlyerMain {

	public static void main(String[] args) {
		Flyer flyer= new Bird();
		flyer.takeoff();
		flyer.fly();
		flyer.land();
		
		System.out.println(" ");
		
		
		flyer = new SuperMan();
		flyer.takeoff();
		flyer.fly();
		flyer.land();
		
	}
}
