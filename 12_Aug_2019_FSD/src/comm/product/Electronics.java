package comm.product;

public class Electronics extends Product {
private int manufacturingYear;

public Electronics() {

}

public Electronics(int manufacturingYear) {
	super(1000);
	this.manufacturingYear = manufacturingYear;
}
@Override
public String getDetails() {
	return "Product no. : "+Book.getproductcount()+"|| Manufacturing Year"+manufacturingYear+super.getDetails();
}

}
