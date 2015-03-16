package persistance.factory;

import persistance.data.generic.*;

public interface Factory
{
    public abstract User makeUser();

	public abstract Inscription makeInscription();

	public abstract Event makeEvent();

	public abstract EventList makeEventList();
}