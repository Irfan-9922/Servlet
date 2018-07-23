package corejava;

import java.util.*;

public class NITcollection {
	private Object[]objArray=new Object[10];
	private int count=0;
	public void add(Object obj)
	{
		if(Size()==Capacity())
		{
			increaseCapacity();
			
		}
		objArray[count]=obj;
		count++;
	}
	
	public int  Size() {
		// TODO Auto-generated method stub
		return count;
	}
	private int Capacity() {
		// TODO Auto-generated method stub
		return objArray.length;
	}


	
	private void increaseCapacity() {
		Object[]tempobj= new Object[Capacity()*2];
		for(int i=0;i<objArray.length;i++)
		{
			tempobj[i]=objArray[i];
		}
		// TODO Auto-generated method stub
		objArray=tempobj;
	}


	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	}

}
