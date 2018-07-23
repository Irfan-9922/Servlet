package tcomretor;

import java.util.TreeSet;

public class emp implements Comparable{

	
	private String name;
	private int id;
	public emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "emp [name=" + name + ", id=" + id + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		//result = prime * result + ((name == name) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		emp other = (emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int id1=this.id;
		emp e=(emp) o;
		int id2=e.id;
		if(id1<id2)
			return -1;
		else if(id1> id2)
			return 1;
		else
		
		return 0;
	}

}
