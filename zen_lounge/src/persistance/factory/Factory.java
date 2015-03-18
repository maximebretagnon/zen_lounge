package persistance.factory;

import persistance.data.generic.*;

public abstract class Factory
{
	private static Factory factory;
	
	public static Factory getInstance(){
		if(factory == null)
			factory = new MySQLFactory();
		return factory;
	}
	
    public abstract User makeUser();

	public abstract Inscription makeInscription();

	public abstract Event makeEvent();

	public abstract EventList makeEventList();

	public abstract Speaker makeSpeaker();

	public abstract Notification makeNotification();

	public abstract AdministratorList makeAdministratorList();

	public abstract Administrator makeAdministrator();
}