package ui.view;

import ui.common.View;
import bl.facade.ShopFacade;
import javax.swing.JLabel;

public class ShoppingCartView extends View{
    public ShoppingCartView() {
		super("Shopping Cart");
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		// TODO Auto-generated constructor stub
	}

	public ShopFacade shopFacade;

}
