package map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class identity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//HashMap h=new HashMap();
		IdentityHashMap h=new IdentityHashMap();
		 student s1=new student(10);
		 student s2=new student(10);
		 
		h.put(s1, "irfan");
		h.put(s2, "irfan");
		System.out.println(s1.equals(s2));
		System.out.println(h);
		
	}

}
