package innerouter;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Outerclass oc = new Outerclass();
     oc.outermethod();
     Outerclass.Innerclass ic = oc.new Innerclass();
     ic.innermethod();
	}

}
