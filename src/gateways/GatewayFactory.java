package gateways;

import Messages.DailyNews;
import Messages.GradesAnnouncement;
import Messages.TaskAdded;

public interface GatewayFactory {
    public DailyNews sendDailyNews();
    public GradesAnnouncement sendGradesAnnouncement();
    public TaskAdded sendAddedTask();
}
