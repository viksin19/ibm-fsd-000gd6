package comm.product;

public class Television extends Electronics {
private String brandname;

public Television() {
	
}

public Television(String brandname, int my) {
	super(my);
	this.brandname = brandname;
}
@Override
public String getDetails() {
	return "Brand Name : "+brandname+super.getDetails();
}

}
