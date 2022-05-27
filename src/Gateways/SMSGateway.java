package Gateways;

import Messages.DailyNews;
import Messages.DailyNewsMobileMessage;
import Messages.GradesAnnouncement;
import Messages.GradesAnnouncementMobileMessage;
import Messages.TaskAdded;
import Messages.TaskAddedMobileMessage;

public class SMSGateway implements GatewayFactory{

	@Override
	public DailyNews sendDailyNews() {
		DailyNews DN = new DailyNewsMobileMessage();
		return DN;
	}

	@Override
	public GradesAnnouncement sendGradesAnnouncement() {
		GradesAnnouncement GA = new GradesAnnouncementMobileMessage();
		return GA;
	}

	@Override
	public TaskAdded sendAddedTask() {
		TaskAdded TA = new TaskAddedMobileMessage();
		return TA;
	}
}//
