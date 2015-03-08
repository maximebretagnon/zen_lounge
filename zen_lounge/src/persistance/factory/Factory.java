package persistance.factory;

import persistance.data.User;

public interface Factory
{
    public abstract User makeUser();
}