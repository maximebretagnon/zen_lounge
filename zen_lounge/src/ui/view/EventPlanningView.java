package ui.view;

import ui.common.View;
import bl.facade.EventFacade;

public class EventPlanningView extends View{
    public EventPlanningView(String name, boolean showMenu) {
		super(name, showMenu);
		// TODO Auto-generated constructor stub
	}

	public String eventList;

    public EventFacade eventFacade;

    public void showEventDetails() {
    }

}
