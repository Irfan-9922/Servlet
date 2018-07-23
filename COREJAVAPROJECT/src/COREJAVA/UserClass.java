package COREJAVA;
  class person{
//	String name;
	String name;
	String fname;
	String mname;
	int age;
	
	 void eat(){
		System.out.println("eat only veg ");

		
		
	}
		
	
//	public String name;
	

}

 class student extends person  {
	

	int rollno;
	int fees;
	String course;
	  void eat()
	{
		
		System.out.println("eat only chiken in sunday");
		super.eat();
	}
	static void m2()
	{
		System.out.println("static method");
	}
	
	

	
	}

public class UserClass extends person{
	static void m3()
	{
		System.out.println("herer the ststic meethod statsement exicuted");
	}

	//private static person Super;
	/**
	 * @param args
	 * 
	 */
	//super.eat();

	//super.eat();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	student am=new student();
	
	//	am.farm();
	
		am.fname="jalil";
		am.mname="jarina";
		//am.add="farasdaput";
//	am.exp=11;
		am.name="shaikh irfan";
		am.age=22;
		am.course="java";
		am.fees=3600;
		am.rollno=99;
		
		//am.mobleno=99228675;
		//am.email="shaikhirfan";
		//am.
		System.out.print(am.name);
		System.out.print(am.fname);
		System.out.print("son of shaikh  ");
		System.out.println(am.mname);
		System.out.println("and the age of ");
		System.out.println(am.age);
		System.out.println("taking the course of");
		System.out.println(am.course);
		System.out.println("for the course fees having ");
		System.out.println(am.fees);
		System.out.println("this is eat only chken in ");
		//am.eat();
		am.eat();
		System.out.println("eat some other foosd ");
		//Super.eat(33);
		m3();
		
	//System.out.println(am.fname+"nisar");
	
	}

	
//super.eat();
	//am.eat();
}
