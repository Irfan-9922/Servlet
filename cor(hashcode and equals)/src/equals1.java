import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class equals1 {
	int id;
	private String name;
	private String course;
	private String loc;
	private int fees;
	private int duretion;
	private int adharno;

	public equals1(int id, String name, String course, String loc, int fees, int duretion, int adharno) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.loc = loc;
		this.fees = fees;
		this.duretion = duretion;
		this.adharno = adharno;
	}

	@Override
	public String toString() {
		return "equals1 [id=" + id + ", name=" + name + ", course=" + course + ", loc=" + loc + ", fees=" + fees
				+ ", duretion=" + duretion + ", adharno=" + adharno + "]";
	}

	
	 
	@Override
	public int hashCode() {

		return id;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		equals1 other = (equals1) obj;
		
		  if (adharno != other.adharno) return false;
		 
		
		  if (course == null) { if (other.course != null) return false; } else
		  if (!course.equals(other.course)) return false;
		 
		
		  if (duretion != other.duretion) return false;
		 
		
		  if (fees != other.fees) return false;
		 
		if (id != other.id)
			return false;
		
		  if (loc == null) { if (other.loc != null) return false; } else if
		  (!loc.equals(other.loc)) return false; if (name == null) { if
		  (other.name != null) return false; } else if
		  (!name.equals(other.name)) return false;
		 
		return true;
	}

	public static void main(String[] args) {
		equals1 e = new equals1(1, "irfan", "java", "latur", 2633, 10, 013);
		equals1 e1 = new equals1(2, "nisar", ".net", "pune", 74632, 6, 9382);
		equals1 e2 = new equals1(3, "ram", "php", "mumbai", 8372, 3, 9483);
		equals1 e3 = new equals1(4, "rohit", "hadoop", "soalapur", 10, 2, 1231);
		
		
		TreeSet s = new TreeSet(new mycomretor1());

		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		for (Object b : s) {
			System.out.println(b);
		}

		
		/*Set s1 = new HashSet(s);
		System.out.println("from set");
		System.out.println(s1);*/

		Set ss = new HashSet();
		ss.add(e1);
		ss.add(e2);
		ss.add(e3);
		ss.add(e);

		System.out.println("from set");
		for (Object d : ss) {

			System.out.println(d);

		}

	
		if ((e.id == e1.id) || (e.adharno == e1.adharno)) {
			System.out.println(e.id + "::::this is duplicate id same as e1:" + e1.id);
		} else {
			System.out.println("duplicate not found");
		}

	}
}
