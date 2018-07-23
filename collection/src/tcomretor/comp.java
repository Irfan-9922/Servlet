package tcomretor;

import java.util.TreeSet;

public class comp {
	
		public static void main(String[] args) {
			emp e1=new emp("irfan", 1);
			emp e2=new emp("nisar", 1);
			emp e3=new emp("ram", 3);
			emp e4=new emp("shivam", 4);
			emp e5=new emp("ram", 6);
			emp e9=new emp("ram", 6);
			emp e6=new emp("irfan", 2);
			emp e7=new emp("irfan", 1);
			
			
			TreeSet t=new TreeSet(new mycompretor());
			t.add(e1);
			t.add(e2);
			t.add(e3);
			t.add(e4);
			t.add(e5);
			t.add(e6);
			t.add(e7);
			System.out.println(t);
			System.out.println(e1.hashCode()==e7.hashCode());
		}
	}


