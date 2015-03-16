package ui.common;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SpringLayout;

import ui.view.NotificationCenterView;
import ui.view.ShoppingCartView;

public class Frame extends JFrame {
	
	private static Frame f;
	
    private final Dimension defaultDimensions = new Dimension(720,480);

    private JTabbedPane tabbedPane;
	
	private Frame() {
		super();
		super.setSize(defaultDimensions);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    	
    	SpringLayout springLayout = new SpringLayout();
    	setLayout(springLayout);
    	
		springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 0, SpringLayout.NORTH, this);
    	springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, this);
    	springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, 445, SpringLayout.NORTH, this);
    	springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 714, SpringLayout.WEST, this);
    	
    	this.add(tabbedPane);
    	((JTabbedPane) tabbedPane).addTab("Notification Center", null, new NotificationCenterView(), null);
    	((JTabbedPane) tabbedPane).addTab("Shopping Cart", null, new ShoppingCartView(), null);
	}
	
	public static Frame getFrame(){
		if(f == null)
			f = new Frame();
		return f;
	}
	
	public JTabbedPane getTabbedPane(){
		return tabbedPane;
	}
	
	public void setView(View v, boolean showTabbedPane){
		super.setTitle(v.getName());
		if(showTabbedPane){
			super.setContentPane(tabbedPane);
			tabbedPane.setComponentAt(tabbedPane.getSelectedIndex(),v);
		}
		else
			super.setContentPane(v);
	}
}