package comm.rest.Domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Todo {
private String id;
private String description;
private Date scheduletime;
public Todo() {
	super();
}
public Todo(String description, Date scheduletime) {
	super();
	this.id = UUID.randomUUID().toString();
	this.description = description;
	this.scheduletime = scheduletime;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getScheduletime() {
	return scheduletime;
}
public void setScheduletime(Date scheduletime) {
	this.scheduletime = scheduletime;
}



}