package persistance.data.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistance.MySQLDatabase;
import persistance.data.generic.User;

public class MSUser extends User{
		
    public MSUser(){
    	super();
    }

	@Override
	public String load(String login, String pwd) {
   	
		String request = "SELECT firstName,lastName,phone,mail,address,login,pwd FROM User where login='"+login+"' and pwd='"+pwd+"'";
    	
    	ResultSet result = MySQLDatabase.getInstance().selectRequest(request);
    	
        //Empty result => Wrong informations
		try
		{
			if(!result.next())
				return "Informations incorrectes. Veuillez réessayer";
			
	    	//Ouverture de session	    	
	    	result.beforeFirst();
	    	while ( result.next() ) {
				super.setFirstName(result.getString("firstName"));
				super.setLastName(result.getString("lastName"));
				super.setPhone(result.getString("phone"));
				super.setMail(result.getString("mail"));
				super.setAddress(result.getString("address"));
				super.setLogin(result.getString("login"));
				super.setPwd(result.getString("pwd"));
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

	@Override
	public String save() {
		return null;
	}
}