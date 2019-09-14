package comm.practice.Runner;

public class Account {
private int accountNumber , ammount;
private String name,accounttype;
public Account() {
	super();
}
public Account(int accountNumber, int ammount, String name, String accounttype) {
	super();
	this.accountNumber = accountNumber;
	this.ammount = ammount;
	this.name = name;
	this.accounttype = accounttype;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public int getAmmount() {
	return ammount;
}
public void setAmmount(int ammount) {
	this.ammount = ammount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + accountNumber;
	result = prime * result + ((accounttype == null) ? 0 : accounttype.hashCode());
	result = prime * result + ammount;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	Account acc = (Account)obj;
	if(this.accountNumber == acc.accountNumber && this.accounttype== acc.accounttype && this.ammount == acc.ammount)
	{ return true; }
	else {
		return false;
	}
}

@Override
public String toString() {
	return "Account [accountNumber=" + accountNumber + ", ammount=" + ammount + ", name=" + name + ", accounttype="
			+ accounttype + "]";
}


}
