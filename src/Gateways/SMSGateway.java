package gateways;

import Messages.DailyNews;
import Messages.DailyNewsMobileMessage;
import Messages.GradesAnnouncement;
import Messages.GradesAnnouncementMobileMessage;
import Messages.TaskAdded;
import Messages.TaskAddedMobileMessage;

public class SMSGateway implements GatewayFactory{

	@Override
	public DailyNews sendDailyNews() {
		return new DailyNewsMobileMessage();
	}

	@Override
	public GradesAnnouncement sendGradesAnnouncement() {
		return new GradesAnnouncementMobileMessage();
	}

	@Override
	public TaskAdded sendAddedTask() {
		return new TaskAddedMobileMessage();
	}
}
