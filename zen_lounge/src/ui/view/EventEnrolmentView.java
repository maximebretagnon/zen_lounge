package ui.view;

import bl.facade.EventFacade;
import ui.common.View;

public class EventEnrolmentView extends View {
    
	public EventEnrolmentView(String name, boolean showMenu) {
		super(name, showMenu);
		// TODO Auto-generated constructor stub
	}

	private String searchNameField;

    private String searchActivityDropDown;

    private String searchSpeakerField;

    private String searchDateField;

    private String searchPlaceDropDown;

    public EventFacade userFacade;

    private void eventSearch() {
    }

}
