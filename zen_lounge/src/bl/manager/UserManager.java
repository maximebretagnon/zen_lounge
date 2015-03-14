package bl.manager;

import persistance.data.generic.User;
import persistance.factory.Factory;
import persistance.factory.MySQLFactory;

public class UserManager {
	
	private Factory factory;
	private User user;
    
    public UserManager(){
    	factory = new MySQLFactory();
    }

    public String handleLogin(String login, String pwd) {
    	user = factory.makeUser();
    	return user.load(login, pwd);
    }
}