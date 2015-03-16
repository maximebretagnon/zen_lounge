package ui.view;

import ui.common.View;
import bl.facade.ShopFacade;

public class ShopView extends View{
    public ShopView() {
		super("Shop");
		// TODO Auto-generated constructor stub
	}

	public String addToCartButton;

    public String menuPanel;

    public ShopFacade shopFacade;

}
