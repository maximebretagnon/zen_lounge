package ui.view;

import ui.common.View;
import bl.facade.EventFacade;

public class EventSearchView extends View{
    public EventSearchView() {
		super("Search an event");
		// TODO Auto-generated constructor stub
	}

	public String nameField;

    public String activityField;

    public String speakerField;

    public String dateField;

    public String placeField;

    public EventFacade eventFacade;

    public void eventSearch() {
    }

}
