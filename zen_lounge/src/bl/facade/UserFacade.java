package bl.facade;

import java.util.List;

import persistance.Session;
import bl.manager.AdministratorManager;
import bl.manager.NotificationManager;
import bl.manager.SpeakerManager;
import bl.manager.UserManager;

public class UserFacade {

	private UserManager userManager;
	private SpeakerManager speakerManager;
	private AdministratorManager administratorManager;
	private NotificationManager notificationManager;
    
    public UserFacade(){
    	userManager = new UserManager();
    	speakerManager = new SpeakerManager();
    	notificationManager = new NotificationManager();
    	administratorManager = new AdministratorManager();
    }
    
    public String handleLogin(String login, String pwd) {
    	return userManager.handleLogin(login, pwd);
    }

	public String handleSubscribe(String login, String pwd, String firstName, String lastName, String phone, String mail, String adress, boolean isSpeaker, String job) {
		String errorMessage = userManager.handleSubscribe(login, pwd, firstName, lastName, phone, mail, adress);
		if(errorMessage == null && isSpeaker) {
			errorMessage = speakerManager.handleSubscribe(login,job);
		}
		return errorMessage;
	}

	public String handleActivityCatAsk(String activityCategory) {
		String userLogin = Session.user().getLogin();
		List<String> administratorLogins = administratorManager.getAllAdministratorID();
		return notificationManager.handleActivityCatAsk(userLogin,activityCategory,administratorLogins);
	}
}