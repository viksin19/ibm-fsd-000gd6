package assignment;

public class Contact implements Comparable<Contact> {
	
	private String name ,email ;
	private long mobile;
	private String address;
	
	
	

	public Contact(String name, String email, long mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public long getMobile() {
		return mobile;
	}




	public void setMobile(long mobile) {
		this.mobile = mobile;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	@Override
	public int compareTo(Contact o1) {
	    if (this.getMobile() > o1.getMobile()) {
	    	return -1;
	    }else {
	    	return 1;
	    }
	
	}

}
