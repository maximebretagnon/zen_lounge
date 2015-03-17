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

	@Override
	public Speaker makeSpeaker() {
		// TODO Auto-generated method stub
		return new MSSpeaker();
	}	
}