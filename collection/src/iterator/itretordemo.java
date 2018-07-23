package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class itretordemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		for(int a=0;a<10;a++)
		{
			al.add(a);
		}
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Integer a=(Integer) itr.next();
			if(a==2)
			System.out.println(a);
			else
				itr.remove();
		}
		
		System.out.println(al);

	}

}
