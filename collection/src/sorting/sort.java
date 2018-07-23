package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		TreeSet s=new TreeSet();
		s.add(11);
		s.add(12);
		s.add(33);
		s.add(99);s.add(98);
		System.out.println(s);
		//retrinving all the elememt after the specified object
	System.out.println(s.tailSet(12));
	//it retriv all the elemet befor the specified element
	System.out.println(s.headSet(98));
	//retriving the first element
	System.out.println(s.first());
	//retriving the next smallest element
	System.out.println(s.lower(33));
	Collections.unmodifiableList(l);
	
	}

}
