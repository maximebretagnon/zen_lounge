package ui.view;

import ui.common.View;
import bl.facade.UserFacade;

public class MemberProfileView extends View{
    public MemberProfileView(String name, boolean showMenu) {
		super(name, showMenu);
		// TODO Auto-generated constructor stub
	}

	public UserFacade userFacade;

}
