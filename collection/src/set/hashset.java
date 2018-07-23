package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet hs=new HashSet();
		for(int a=0;a<17;a++)
		{
			hs.add(a);
		}
		hs.add(8888);
		hs.add(22);
		hs.add(33);
		System.out.println(hs);
		LinkedList l=new LinkedList();
		for(int a=0;a<17;a++)
		{
			l.add(a);
		}
		l.add(8888);
		l.add(22);
		l.add(33);
		System.out.println(l);
       
	}

}