package tcomretor;

import java.util.Comparator;

public class emp1 implements Comparator{

	
	@Override
	public String toString() {
		return "emp1 [name=" + name + ", id=" + id + "]";
	}
	String name;
	int id;
	public emp1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		emp1 e1=(emp1) o1;
		emp1 e2=(emp1) o2;
	     String s=e1.toString();
	     String s2=e2.toString();
	     return s.compareTo(s2);
	}

}
