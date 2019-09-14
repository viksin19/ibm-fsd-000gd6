package example.interfac;

public class Monkey {
 
	private String name;
	
	public Monkey(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
 
	public void createLivivngThings() {
		// anonymous inner class
		LivingThings livingthings = new LivingThings() {
	@Override
	public void walk() {
		
		// TODO Auto-generated method stub
       System.out.println("Monkey "+getName()+"can walk");
	}
		};
		livingthings.walk();
	
}

}
