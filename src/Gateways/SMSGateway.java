package Gateways;

import Messages.DailyNews;
import Messages.DailyNewsMobileMessage;
import Messages.GradesAnnouncement;
import Messages.GradesAnnouncementMobileMessage;
import Messages.TaskAdded;
import Messages.TaskAddedMobileMessage;

public class SMSGateway implements GatewayFactory{

	
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsMobileMessage) {
			DailyNewsMobileMessage msg = (DailyNewsMobileMessage) message;
			
			msg.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementMobileMessage) {
			GradesAnnouncementMobileMessage msg = (GradesAnnouncementMobileMessage) message;
			
			msg.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedMobileMessage) {
			TaskAddedMobileMessage msg = (TaskAddedMobileMessage) message;
			
			msg.prepareMessage(placeHolders);
			
			// some code to send message to user
		}
		
	}

	@Override
	public DailyNews sendDailyNews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GradesAnnouncement sendGradesAnnouncement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskAdded sendAddedTask() {
		// TODO Auto-generated method stub
		return null;
	}
}
