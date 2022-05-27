package gateways;

import messages.DailyNews;
import messages.GradesAnnouncement;
import messages.TaskAdded;

public interface GatewayFactory {
    public DailyNews sendDailyNews();
    public GradesAnnouncement sendGradesAnnouncement();
    public TaskAdded sendAddedTask();
}
