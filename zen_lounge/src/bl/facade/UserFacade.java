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
}