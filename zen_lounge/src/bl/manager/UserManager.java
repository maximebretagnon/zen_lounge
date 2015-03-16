package bl.manager;

import persistance.data.generic.User;
import persistance.factory.Factory;
import persistance.factory.MySQLFactory;
import persistance.Session;

public class UserManager {
	
	private Factory factory;
	private User user;
    
    public UserManager(){
    	factory = new MySQLFactory();
    }

    public String handleLogin(String login, String pwd) {
    	user = factory.makeUser();
    	String loadResult = user.load(login, pwd);
    	if(loadResult == null)
    		Session.setUserForSession(user);
    	return loadResult;
    }

	public String handleSubscribe(String login, String pwd, String firstName, String lastName, String phone, String mail, String adress, boolean isSpeaker, String job) {
		user = factory.makeUser();
		
		String resultMessage = user.check(login);
		if(resultMessage.equals("User registered"))
			return "Login already exists - Please try another one";
		if(resultMessage.equals("User not registered")){
			user.setLogin(login);
			user.setPwd(pwd);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setPhone(phone);
			user.setMail(mail);
			user.setAdress(adress);
			
			
			
			return user.save();
		}
		else
			return "An error has occured. Please retry";
	}

	public String getUserID() 
	{
		return Session.user().getLogin();
	}
}