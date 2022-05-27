package gateways;

import Messages.DailyNews;
import Messages.DailyNewsEmailMessage;
import Messages.GradesAnnouncement;
import Messages.GradesAnnouncementEmailMessage;
import Messages.TaskAdded;
import Messages.TaskAddedEmailMessage;

public class EmailGateway implements GatewayFactory{

	@Override
	public DailyNews sendDailyNews() {
		return new DailyNewsEmailMessage();
	}

	@Override
	public GradesAnnouncement sendGradesAnnouncement() {
		return new GradesAnnouncementEmailMessage();
	}

	@Override
	public TaskAdded sendAddedTask() {
		return new TaskAddedEmailMessage();
	}
}
