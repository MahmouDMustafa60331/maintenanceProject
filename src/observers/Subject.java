package observers;
import users.User;

public interface Subject {
    
    public void subscribeUserEmailNotification(User user);

    public void subscribeUserSMSNotification(User user);

    public void notifyAllUsers(String[] placeholders);
}
