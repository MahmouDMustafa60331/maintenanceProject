package observers;
import java.util.ArrayList;

import users.User;
import gateways.GatewayFactory;
import gateways.SMSGateway;

public class Course implements Subject{
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	
	ArrayList<User> usersForEmailNotification;
	ArrayList<User> usersForSMSNotification;

	GatewayFactory Gateway;
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<String>();
		exams = new ArrayList<String>();
		grades = new ArrayList<String>();
		
		usersForEmailNotification = new ArrayList<User>();
		usersForSMSNotification = new ArrayList<User>();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setGateway(GatewayFactory g) {
		this.Gateway = g;
	}
	
	
	
	public void AddAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	@Override
	public void subscribeUserEmailNotification(User user) {
		usersForEmailNotification.add(user);
		
	}

	@Override
	public void subscribeUserSMSNotification(User user) {
		usersForSMSNotification.add(user);
		
	}

	@Override
	public void notifyAllUsers(String[] placeholders) {
		String msg;
		msg = Gateway.sendAddedTask().prepareMessage(placeholders);
		if(Gateway instanceof SMSGateway){
			for (User User : usersForSMSNotification){
				User.Update(msg);
			}
		}
		else{
			for (User User : usersForEmailNotification){
				User.Update(msg);
			}
		}
	}
}
