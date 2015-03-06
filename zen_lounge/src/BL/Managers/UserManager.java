package BL.Managers;

import java.sql.SQLException;

import BL.Others.Utilitary;
import Data.Datas.MySQLUserData;
import Data.Datas.UserData;
import UI.Common.ViewIF;

public class UserManager {
	
    public UserData userData;

    public ViewIF viewIF;
    
    public UserManager(ViewIF viewIF){
    	userData = null;
    	this.viewIF = viewIF;
    }

    public String handleLogin(String login, String pwd) {
    	
    	try {
			userData = new MySQLUserData().getUser(login,pwd);
			
			if(userData == null)
				return "Informations incorrectes. Veuillez r�essayer";
			
	    	System.out.println(pwd);
		}
    	catch (SQLException e)
    	{
			return e.getMessage();
		}
    	return null;
    }
}