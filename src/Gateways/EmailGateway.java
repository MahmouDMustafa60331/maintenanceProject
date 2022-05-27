package Gateways;

import Messages.DailyNews;
import Messages.DailyNewsEmailMessage;
import Messages.GradesAnnouncement;
import Messages.GradesAnnouncementEmailMessage;
import Messages.TaskAdded;
import Messages.TaskAddedEmailMessage;

public class EmailGateway implements GatewayFactory{
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		

		
		else if(message instanceof GradesAnnouncementEmailMessage) {
			GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;
			
			announcementEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedEmailMessage) {
			TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;
			
			addedEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message by email to user
		}
	}

	@Override
	public DailyNews sendDailyNews() {
		if(message instanceof DailyNewsEmailMessage) {
			DailyNewsEmailMessage dailyNewsEmailMessage = (DailyNewsEmailMessage) message;
			
			dailyNewsEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		return null;
	}

	@Override
	public GradesAnnouncement sendGradesAnnouncement() {
		else if(message instanceof GradesAnnouncementEmailMessage) {
			GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;
			
			announcementEmailMessage.prepareMessage(placeHolders);
		}
		return null;
		}
	}

	@Override
	public TaskAdded sendAddedTask() {
		TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;
			
		addedEmailMessage.prepareMessage(placeHolders);
		return null;
	}
}
