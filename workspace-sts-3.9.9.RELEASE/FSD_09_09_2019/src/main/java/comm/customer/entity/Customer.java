package comm.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Customer {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="first_name")
private String firstname;
@Column(name="last_name")
private String lastname;
@Column(name="email")
private String email;

public Customer() {
	// TODO Auto-generated constructor stub
	super();
}

public Customer(String firstname, String lastname, String email) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
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

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}
