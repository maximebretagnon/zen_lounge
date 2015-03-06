package Data.Datas;
import java.sql.ResultSet;
import java.sql.SQLException;

import Data.Database;
import Data.MySQLDatabase;

public class MySQLUserData extends UserData{
	
	private MySQLDatabase db;
	
    public MySQLUserData(){
    	super();
    	db = (MySQLDatabase)Database.getDatabase();
    }
	

	public UserData getUser(String login, String pwd) throws SQLException {
		
    	ResultSet result = Database.getDatabase().getUser(login,pwd);
    	
    	//If the result is empty
    	if(!result.next())
    		return null;
    	//else
    	
    	//Ouverture de session
    	
    	result.beforeFirst();
    	while ( result.next() ) {
			firstName = result.getString("firstName");
			lastName = result.getString("lastName");
			phone = result.getString("phone");
			mail = result.getString("mail");
			address = result.getString("address");
			super.login = result.getString("login");
			super.pwd = result.getString("pwd");
		}
	    /* On ferme le ResultSet */
	    result.close();

    	return this;
	}
}