<<<<<<< HEAD
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
=======
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
>>>>>>> 2864f15d73c947a8aec49c905b317c863649166d
