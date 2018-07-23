package map;

public class student  {
	int id;

	public student(int id) {
		super();
		this.id = id;
	}
	/*public boolean equals(Object obj)
	{
		this.obj=obj;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		student other = (student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
