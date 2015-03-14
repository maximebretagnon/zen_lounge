package persistance.factory;

import persistance.data.generic.User;

public interface Factory
{
    public abstract User makeUser();
}