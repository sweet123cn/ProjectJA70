package ProjectB;

import java.io.Serializable;

public class Employee implements Serializable {

	private String name;
	private int id;
	private Date hireDate;
	private String position;
	
	public Employee(String n, int idNum, Date hDate, String p) {
		name = n;
		id = idNum;
		hireDate = hDate;
		position = p;	
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getId() {
		return id;
	}

	public void setId(int idNum) {
		id = idNum;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hDate) {
		hireDate = hDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String p) {
		position = p;
	}
//override toString return employee information
	@Override
	public String toString() {
		return "Employee name: " + name + ", id: " + id + ", hireDate: " + hireDate + ", position: " + position;
	}
	
}
