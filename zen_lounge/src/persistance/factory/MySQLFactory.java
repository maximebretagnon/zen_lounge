package persistance.factory;

import persistance.data.MySQLUser;
import persistance.data.User;

public class MySQLFactory implements Factory
{
	@Override
	public User makeUser() {
    	return new MySQLUser();
	}	
}