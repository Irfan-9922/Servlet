package tcomretor;

import java.util.Comparator;

public class mycompretor implements Comparator {

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		emp e1=(emp) o1;
		emp e2=(emp) o2;
	     String s=e1.toString();
	     String s2=e2.toString();
	     return s.compareTo(s2);
	}
}
