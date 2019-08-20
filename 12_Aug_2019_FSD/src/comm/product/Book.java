package comm.product;

public class Book extends Product {
private String bookname;

public Book() {
	super();
}

public Book(String bookname) {
	super(200);
	this.bookname = bookname;
}
@Override
public String getDetails() {
	return "Product no. :  "+Product.getproductcount()+"Book Name : "+bookname+super.getDetails();
}

}
