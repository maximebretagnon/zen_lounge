package ui.view;

import ui.common.View;
import bl.facade.ShopFacade;

public class ShopView extends View{
    public ShopView(String name, boolean showMenu) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String addToCartButton;

    public String menuPanel;

    public ShopFacade shopFacade;

}
