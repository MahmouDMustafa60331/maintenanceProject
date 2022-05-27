package Gateways;

import Messages.DailyNews;
import Messages.DailyNewsEmailMessage;
import Messages.GradesAnnouncement;
import Messages.GradesAnnouncementEmailMessage;
import Messages.TaskAdded;
import Messages.TaskAddedEmailMessage;

public class EmailGateway implements GatewayFactory{

	@Override
	public DailyNews sendDailyNews() {
		DailyNews DN = new DailyNewsEmailMessage();
		return DN;
	}

	@Override
	public GradesAnnouncement sendGradesAnnouncement() {
		GradesAnnouncement GA = new GradesAnnouncementEmailMessage();
		return GA;
	}

	@Override
	public TaskAdded sendAddedTask() {
		TaskAdded TA = new TaskAddedEmailMessage();
		return TA;
	}
	//solved
}
