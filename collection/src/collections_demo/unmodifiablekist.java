package collections_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class unmodifiablekist {

	public static void main(String[] args) throws UnsupportedOperationException{
		// TODO Auto-generated method stub
  List l=new ArrayList();
  l.add("irfan");
  l.add("patel");
  l.add("at");
  l.add("faradapur");
  System.out.println(l);
  List k=Collections.unmodifiableList(l);
 k.add("jsdks");
  l.add("lsdk");
  l.add("lsdk");
  l.add("lsdk");
  l.add("lsdk");
  System.out.println(l);
 
	}

}
