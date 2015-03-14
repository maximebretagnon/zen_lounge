package persistance.factory;

import persistance.data.generic.User;
import persistance.data.mysql.MSUser;

public class MySQLFactory implements Factory
{
	@Override
	public User makeUser() {
    	return new MSUser();
	}	
}