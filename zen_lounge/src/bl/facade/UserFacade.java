package bl.facade;

import bl.manager.SpeakerManager;
import bl.manager.UserManager;

public class UserFacade {

	private UserManager userManager;
	private SpeakerManager speakerManager;
    
    public UserFacade(){
    	userManager = new UserManager();
    	speakerManager = new SpeakerManager();
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
}