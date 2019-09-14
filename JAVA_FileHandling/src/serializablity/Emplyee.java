package serializablity;

import java.io.Serializable;

public class Emplyee implements Serializable {

	private int Id;
	private String name ;
	private long salary;
	private transient String address;  //transient will ignore the storage of this variable
	public Emplyee() {
		super();
	}
	public Emplyee(int id, String name, long salary, String address) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emplyee [Id=" + Id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}
