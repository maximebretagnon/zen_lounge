package BL.Facades;

import BL.Managers.UserManager;

public class UserFacade {
	
	private UserManager userManager;
    
    public UserFacade(){
    	userManager = new UserManager();
    }
    
    public String handleLogin(String login, String pwd) {
    	return userManager.handleLogin(login, pwd);
    }
}