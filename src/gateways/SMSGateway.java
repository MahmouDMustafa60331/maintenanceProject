package gateways;

import messages.DailyNews;
import messages.DailyNewsMobileMessage;
import messages.GradesAnnouncement;
import messages.GradesAnnouncementMobileMessage;
import messages.TaskAdded;
import messages.TaskAddedMobileMessage;

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
