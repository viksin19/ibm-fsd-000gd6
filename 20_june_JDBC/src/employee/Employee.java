package employee;
import java.io.Serializable;
public class Employee implements Serializable {
	
	private int id;
	private String firstname;
	
	private String email;
	public Employee() {
		super();
	}
	public Employee(int id, String firstname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
