package comm.practice;

public class ContractualEmployee extends Employee {
private int ratePerhour;

public ContractualEmployee() {

}

public ContractualEmployee(int ratePerhour) {
	super(2,"Jai Singh");
	this.ratePerhour = ratePerhour;
}
@Override
public String getDetails() {
	return super.getDetails()+"     ||Rate Per Hour : "+ratePerhour;
}

}
