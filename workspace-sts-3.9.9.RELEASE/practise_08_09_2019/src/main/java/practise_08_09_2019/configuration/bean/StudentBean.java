package practise_08_09_2019.configuration.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentObj")
public class StudentBean {
@Value("10")
 int id;
@Value("name of std")
 String name;
 




public int getId() {
	return id;
}





public void setId(int id) {
	this.id = id;
}





public String getName() {
	return name;
}





public void setName(String name) {
	this.name = name;
}





public StudentBean() {
	super();
}





public StudentBean(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
 
}
