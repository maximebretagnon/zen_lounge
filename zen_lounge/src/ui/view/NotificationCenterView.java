package ui.view;

import javax.swing.JButton;

import ui.common.View;

public class NotificationCenterView extends View {

	public NotificationCenterView() {
		super("Notification Center");
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(112, 129, 97, 25);
		add(btnNewButton);		
	}
}