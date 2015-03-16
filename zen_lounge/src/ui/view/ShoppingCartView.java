package ui.view;

import ui.common.View;
import bl.facade.ShopFacade;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.JSpinner;

public class ShoppingCartView extends View{
    public ShoppingCartView(String name, boolean showMenu) {
		super(name);
		SpringLayout springLayout = (SpringLayout) getLayout();
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 99, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 55, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -107, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, -55, SpringLayout.EAST, this);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		add(panel);
		
		JButton btnNewButton = new JButton("Buy !");
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -36, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -331, SpringLayout.EAST, this);
		add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 11, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 555, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -73, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -61, SpringLayout.EAST, this);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(255, 248, 220));
		add(panel_1);
		
		JLabel lblTotal = new JLabel("Total");
		springLayout.putConstraint(SpringLayout.NORTH, lblTotal, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTotal, -31, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, lblTotal, -19, SpringLayout.WEST, panel_1);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JScrollBar scrollBar = new JScrollBar();
		sl_panel.putConstraint(SpringLayout.NORTH, scrollBar, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, scrollBar, -2, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, scrollBar, 0, SpringLayout.EAST, panel);
		panel.add(scrollBar);
		
		JSeparator separator = new JSeparator();
		sl_panel.putConstraint(SpringLayout.NORTH, separator, 34, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, separator, 2, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, separator, 36, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, separator, -6, SpringLayout.WEST, scrollBar);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("Product");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, separator);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 36, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, separator);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel_1);
		
		JLabel lblUnitPrice = new JLabel("Unit Price");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblUnitPrice, -6, SpringLayout.NORTH, separator);
		lblUnitPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblUnitPrice);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 324, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblUnitPrice, -43, SpringLayout.WEST, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -6, SpringLayout.NORTH, separator);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_3, 10, SpringLayout.SOUTH, separator);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(new Color(255, 248, 220));
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		sl_panel.putConstraint(SpringLayout.WEST, panel_4, 312, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_4, -211, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_3, -27, SpringLayout.WEST, panel_4);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_4, 10, SpringLayout.SOUTH, separator);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_4, 0, SpringLayout.SOUTH, panel_3);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(new Color(255, 248, 220));
		panel.add(panel_4);
		
		JButton btnNewButton_1 = new JButton("Remove");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 10, SpringLayout.SOUTH, separator);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_1, 18, SpringLayout.EAST, panel_4);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 0, SpringLayout.SOUTH, panel_3);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Details");
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_1, -6, SpringLayout.WEST, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2, 10, SpringLayout.SOUTH, separator);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2, 110, SpringLayout.EAST, panel_4);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 0, SpringLayout.SOUTH, panel_3);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2, -6, SpringLayout.WEST, scrollBar);
		panel.add(btnNewButton_2);
		
		JSpinner spinner = new JSpinner();
		sl_panel.putConstraint(SpringLayout.EAST, spinner, -435, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_3, 40, SpringLayout.EAST, spinner);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_3, 0, SpringLayout.SOUTH, spinner);
		sl_panel.putConstraint(SpringLayout.NORTH, spinner, 10, SpringLayout.SOUTH, separator);
		panel.add(spinner);
		
		JLabel lblItem = new JLabel("Item");
		sl_panel.putConstraint(SpringLayout.WEST, spinner, 57, SpringLayout.EAST, lblItem);
		sl_panel.putConstraint(SpringLayout.SOUTH, spinner, 0, SpringLayout.SOUTH, lblItem);
		sl_panel.putConstraint(SpringLayout.NORTH, lblItem, 8, SpringLayout.SOUTH, separator);
		sl_panel.putConstraint(SpringLayout.WEST, lblItem, 22, SpringLayout.WEST, panel);
		lblItem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblItem);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblTotal);
		// TODO Auto-generated constructor stub
	}

	public ShopFacade shopFacade;
}
