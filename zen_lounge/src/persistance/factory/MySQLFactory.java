package persistance.factory;

import persistance.data.MSUser;
import persistance.data.User;

public class MySQLFactory implements Factory
{
	@Override
	public User makeUser() {
    	return new MSUser();
	}	
}