package bl.manager;

import java.util.List;

import persistance.data.generic.Notification;
import persistance.factory.Factory;

public class NotificationManager {
	
	private Factory factory;
	private Notification notif;

	public NotificationManager(){
		factory = Factory.getInstance();
	}
	
	public String handleActivityCatAsk(String userLogin, String activityCategory,List<String>receivers) {
		notif = factory.makeNotification();
		notif.setSender(userLogin);
		notif.setMessage(activityCategory);
		notif.setReceivers(receivers);
		notif.save();

		return null;
	}
}