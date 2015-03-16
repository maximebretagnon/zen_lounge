package persistance.factory;

import persistance.data.generic.Event;
import persistance.data.generic.EventList;
import persistance.data.generic.Inscription;
import persistance.data.generic.User;
import persistance.data.mysql.MSEvent;
import persistance.data.mysql.MSEventList;
import persistance.data.mysql.MSInscription;
import persistance.data.mysql.MSUser;

public class MySQLFactory implements Factory
{
	@Override
	public User makeUser() {
    	return new MSUser();
	}

	@Override
	public Inscription makeInscription() {
		// TODO Auto-generated method stub
		return new MSInscription();
	}

	@Override
	public Event makeEvent() {
		// TODO Auto-generated method stub
		return new MSEvent();
	}

	@Override
	public EventList makeEventList() {
		// TODO Auto-generated method stub
		return new MSEventList();
	}	
}