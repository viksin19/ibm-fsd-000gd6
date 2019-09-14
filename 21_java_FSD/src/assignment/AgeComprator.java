package assignment;

import java.util.Comparator;

public class AgeComprator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		if(e1.getAge() > e2.getAge()) {
		return 1;
		}else if(e1.getAge()==e2.getAge()) {
			if(e1.getDtaeofjoining().compareTo(e2.getDtaeofjoining())<0) {
				return 1;
			}else {
				return -1;
			}
		}
		return 0;
	}

}
