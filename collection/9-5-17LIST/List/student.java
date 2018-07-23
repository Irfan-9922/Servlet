/**
 * JAVA BOSS @2017 ALL RIGHTS ARE RESERVED
 */
package List;

/**
 * @author :IRFAN
 *
 * DATE:09-May-2017
* TIME:2:34:20 PM
*PROJECT_NAME:collection
 */
public class student {
	String name;
	private int rollno;
	private String fname;
	private String mname;
	private String schoolname;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + ", fname=" + fname + ", mname=" + mname
				+ ", schoolname=" + schoolname + ", city=" + city + "]";
	}

}
