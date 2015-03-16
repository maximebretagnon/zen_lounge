package ui.view;

import javax.swing.JButton;

import ui.common.View;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;

public class NotificationCenterView extends View {

	private JPanel panel;
	
	public NotificationCenterView() {
		super("Notification Center");
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel newNotifLb = new JLabel("You have 4 new notifications");
		springLayout.putConstraint(SpringLayout.NORTH, newNotifLb, 29, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, newNotifLb, 167, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, newNotifLb, 43, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, newNotifLb, -168, SpringLayout.EAST, this);
		newNotifLb.setHorizontalAlignment(SwingConstants.CENTER);
		newNotifLb.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(newNotifLb);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 25, SpringLayout.SOUTH, newNotifLb);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 73, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -68, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -74, SpringLayout.EAST, this);
		add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setRowHeaderView(panel);

		panel.setLayout(new GridLayout(22, 3, 0, 0));

		panel.add(new JLabel("Message"));
		panel.add(new JLabel("By"));
		panel.add(new JLabel("Status"));
		
		for(int i = 0 ; i < 21 ; i++){
			panel.add(new JLabel("Message N°"+(i+1)));
			panel.add(new JLabel("By N°"+(i+1)));
			panel.add(new JLabel("Status N°"+(i+1)));
		}
	}
	
	public void setNotifications(int nbNotif) {

		panel.setLayout(new GridLayout(nbNotif+1, 3, 0, 0));

		panel.add(new JLabel("Message"));
		panel.add(new JLabel("By"));
		panel.add(new JLabel("Status"));
		
		for(int i = 0 ; i < nbNotif ; i++){
			panel.add(new JLabel("Message N°"+(i+1)));
			panel.add(new JLabel("By N°"+(i+1)));
			panel.add(new JLabel("Status N°"+(i+1)));
		}
	}
}
