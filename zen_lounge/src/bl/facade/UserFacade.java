package bl.facade;

import bl.manager.UserManager;

public class UserFacade {

	private UserManager userManager;
    
    public UserFacade(){
    	userManager = new UserManager();
    }
    
    public String handleLogin(String login, String pwd) {
    	return userManager.handleLogin(login, pwd);
    }

	public String handleSubscribe(String login, String pwd, String firstName, String lastName, String phone, String mail, String adress, boolean isSpeaker, String job) {
		return userManager.handleSubscribe(login, pwd, firstName, lastName, phone, mail, adress, isSpeaker, job);
	}
}