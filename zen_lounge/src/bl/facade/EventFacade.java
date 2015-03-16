package bl.facade;

import bl.manager.EventManager;
import bl.manager.UserManager;

public class EventFacade 
{
    public EventManager eventManager;
    public UserManager userManager;

    public EventFacade()
    {
    	userManager = new UserManager();
    	eventManager = new EventManager();
    }

	public String handleEventInscription(String chosenEvent) 
	{
		String userID = userManager.getUserID();
		eventManager.handleEventInscription(userID, chosenEvent);
		return userID;
	}

}
