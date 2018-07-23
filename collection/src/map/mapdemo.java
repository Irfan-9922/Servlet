package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		m.put("j", "irfan");
		m.put("a", "nisar");
		m.put(3, "jim");
		m.put(1, "patel");
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{/*
			Map.Entry e=(Entry) itr.next();
			System.out.println(e.getKey());*/
			Map.Entry h=(Entry) itr.next();
			System.out.println(h.getKey());
		}
		
		}

}
