package persistance.data.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistance.MySQLDatabase;
import persistance.data.generic.Administrator;
import persistance.data.generic.AdministratorList;

public class MSAdministratorList extends AdministratorList {

	@Override
	public String load() {
		String request = "SELECT user FROM Administrator";
    	
    	ResultSet result = MySQLDatabase.getInstance().selectRequest(request);
    	
		try
		{
	        //Empty result => Wrong informations
			if(!result.next())
				return "Aucun administrateur dans la base";
			
	    	//Ouverture de session	    	
	    	result.beforeFirst();
	    	Administrator admin;
	    	while ( result.next() ) {
	    		admin = new MSAdministrator();
	    		admin.setUser(result.getString("user"));
				super.add(admin);
			}
		    /* On ferme le ResultSet */
		    result.close();

	    	return null;
		}
		catch (SQLException e)
		{
			return e.getMessage();
		}
		catch (NullPointerException e)
		{
			return e.getMessage();
		}
	}
}