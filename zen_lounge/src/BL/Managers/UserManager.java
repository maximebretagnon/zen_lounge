package BL.Managers;

import Data.Database;
import Data.Datas.UserData;

public class UserManager {
	
	private Database db;
    
    public UserManager(){
    	db = Database.getDatabase();
    }

    public String handleLogin(String login, String pwd) {
    	
    	try {
			UserData userData = db.getUser(login,pwd);
			
			if(userData == null)
				return "Informations incorrectes. Veuillez réessayer";
			
	    	System.out.println(pwd);
		}
    	catch (Exception e)
    	{
			return e.getMessage();
		}
    	return null;
    }
}