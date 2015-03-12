package ui.view;

import ui.common.View;
import bl.facade.UserFacade;

public class SubscribeView extends View{
    public SubscribeView(String name, boolean showMenu) {
		super(name, showMenu);
		// TODO Auto-generated constructor stub
	}

	public String firstNameField;

    public String lastNameField;

    public String loginField;

    public String jobField;

    public String speakerCheckBox;

    public String pwdField;

    public String pwdCheckField;

    public UserFacade userFacade;

    public void subscribe() {
    }

}
