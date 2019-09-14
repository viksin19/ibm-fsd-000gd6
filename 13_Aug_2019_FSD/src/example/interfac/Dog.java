<<<<<<< HEAD
package example.interfac;

public class Dog implements LivingThings {
 
	private String name,breed;
	
	public Dog(String name, String breed) {
	
		this.name = name;
		this.breed = breed;
	}
	
	public String getname() {
		return name;
	}
	public String getBreed() {
		return breed;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Dog "+getname()+" breed "+getBreed()+" can walk");

	}

}
=======
package example.interfac;

public class Dog implements LivingThings {
 
	private String name,breed;
	
	public Dog(String name, String breed) {
	
		this.name = name;
		this.breed = breed;
	}
	
	public String getname() {
		return name;
	}
	public String getBreed() {
		return breed;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Dog "+getname()+" breed "+getBreed()+" can walk");

	}

}
>>>>>>> 2864f15d73c947a8aec49c905b317c863649166d
