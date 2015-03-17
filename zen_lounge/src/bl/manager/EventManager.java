package bl.manager;

import javax.swing.JComboBox;

import persistance.factory.Factory;
import persistance.data.generic.EventList;
import persistance.data.generic.Inscription;

public class EventManager 
{
    public Factory factory;
    public EventList event;

    public Inscription inscription;
    
    public EventManager()
    {
    	factory = Factory.getInstance();
    }

    public void handleEventSearch() 
    {
    	
    }

    public void getEvent() 
    {
    	
    }

    public void handleEventInscription(String userID, String chosenEvent) 
    {
    	inscription = factory.makeInscription();
    	inscription.save(userID,chosenEvent);
    }

    public void getAllEvents(JComboBox comboBoxChoice) 
    {
    	event = factory.makeEventList();
    	event.load(comboBoxChoice);
    }

}