package users;

import java.sql.Date;

public class Professor extends User {

	String department;
	Date hirringDate;
	String phDTopic;
	
	public Professor( String department, Date hirringDate, String phDTopic , String name, String email,String phoneNumber) {
		super(name ,email,phoneNumber);
		this.department = department;
		this.hirringDate = hirringDate;
		this.phDTopic = phDTopic;
		
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
		return phDTopic;
	}
	
	public void setPhDTopic(String phDTopic) {
		this.phDTopic = phDTopic;
	}
	@Override
	public void update(String name) {
		// do some stuff
	}
	
	
	
}
