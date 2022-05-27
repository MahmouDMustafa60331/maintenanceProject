package gateways;

import messages.DailyNews;
import messages.DailyNewsEmailMessage;
import messages.GradesAnnouncement;
import messages.GradesAnnouncementEmailMessage;
import messages.TaskAdded;
import messages.TaskAddedEmailMessage;

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
