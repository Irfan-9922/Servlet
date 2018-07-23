package tcomretor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class comretor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"iii","jj","kk","ll","aa","aa"};
		List l=new ArrayList();
		for(int a=0;a<s.length;a++)
		{
			int count=0;
			/*if(s1.add(s[a])==false)
			{
				System.out.println(s[a]);
				count++;
				System.out.println(count);
			}*/
			l.add(s[a]);
			
			
		}
		System.out.println("in normal ");
		System.out.println(l);
		System.out.println("in asending ");
		Collections.sort(l);
		System.out.println(l);
		System.out.println("in revers ");
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		//System.out.println(count);
		/*List t=new ArrayList();
		t.add(12);
		t.add(22);
		t.add(1);
		t.add(33);
		t.add(22);
		t.add(88);
		Collections.sort(t)*/;
		//Collections.sort(t,Collections.reverseOrder());
		//Collections.reverse(t);
	//	Collections.sort(t,Collections.reverseOrder());
		/*t.add(new StringBuffer("irfan"));
		t.add(new StringBuffer("abi"));
		t.add(new StringBuffer("ram"));
		t.add(new StringBuffer("shiva"));
		t.add(new StringBuffer("papa"));
		t.add(new StringBuffer("mom"));*/
	

	}

}
