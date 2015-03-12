package ui.view;

import java.util.Date;

import ui.common.View;
import bl.facade.EventFacade;

public class EventDetailsView extends View{
    public EventDetailsView(String name, boolean showMenu) {
		super(name, showMenu);
		// TODO Auto-generated constructor stub
	}

	public String nameLabel;

    public int priceLabel;

    public Date dateLabel;

    public int nbParticipantLabel;

    public EventFacade eventFacade;

}
