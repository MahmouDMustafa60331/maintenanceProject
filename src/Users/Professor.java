package Users;

import java.sql.Date;

public class Professor extends User {

	String department;
	Date hirringDate;
	String PhDTopic;
	
	public Professor( String department, Date hirringDate, String phDTopic , String name, String email,String phoneNumber) {
		super(name ,email,phoneNumber);
		this.department = department;
		this.hirringDate = hirringDate;
		PhDTopic = phDTopic;
		
		}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHirringDate() {
		return hirringDate;
	}
	public void setHirringDate(Date hirringDate) {
		this.hirringDate = hirringDate;
	}
	public String getPhDTopic() {
		return PhDTopic;
	}
	public void setPhDTopic(String phDTopic) {
		PhDTopic = phDTopic;
	}
	
	
	public void Update(String name) {
		// do some stuff
	}
	
	
	
}
