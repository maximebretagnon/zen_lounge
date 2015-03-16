package persistance;

import persistance.data.generic.User;

public class Session {
	
	private static User user;
	
	public static void setUserForSession(User userSession){
		user = userSession;
	}

	public static User user(){
		return user;
	}
}