package persistance.factory;

import persistance.data.generic.*;
import persistance.data.mysql.*;

public class MySQLFactory extends Factory
{
	protected MySQLFactory(){
		
	}
	
	@Override
	public User makeUser() {
    	return new MSUser();
	}

	@Override
	public Inscription makeInscription() {
		return new MSInscription();
	}

	@Override
	public Event makeEvent() {
		return new MSEvent();
	}

	@Override
	public EventList makeEventList() {
		return new MSEventList();
	}

	@Override
	public Speaker makeSpeaker() {
		return new MSSpeaker();
	}	

	@Override
	public Notification makeNotification() {
		return new MSNotification();
	}

	@Override
	public AdministratorList makeAdministratorList() {
		return new MSAdministratorList();
	}

	@Override
	public Administrator makeAdministrator() {
		return new MSAdministrator();
	}
}