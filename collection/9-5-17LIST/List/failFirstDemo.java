/**
 * JAVA BOSS @2017 ALL RIGHTS ARE RESERVED
 */
package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import iterator.itretordemo;

/**
 * @author :IRFAN
 *
 * DATE:09-May-2017
* TIME:2:34:02 PM
*PROJECT_NAME:collection
 */
public class failFirstDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.setCity("latur");
		s.setFname("jalil");
		s.setMname("jarina");
		s.setName("irfan");
		s.setRollno(12);
		s.setSchoolname("dccl");
		int a=10;
		int b=23;
		List list=new ArrayList();
		//list.add(s);
		list.add(a);
		list.add(b);
		System.out.println(list);
		//we are iterating value in four ways 
		//first by using iterator
		Iterator itr=list.iterator();
	
		while(itr.hasNext()){
			Integer j=(Integer) itr.next();
			if(a==10){
				
				itr.remove();
		
				System.out.println("added"+list);
			}
			else{
				list.remove(a);
			}
		}
		//second by using for loop
		/*for(int a=0;a<list.size();a++){
			System.out.println(list.get(a));
		}*/
		//third by using enhanced for loop
		/*for(Object demo:list){
			System.out.println(demo);
		}*/
		//by using while loop
	/*int	j=0;
		while(j<list.size()){
			System.out.println(list.get(j));
			j++;
		}*/

	}

}
