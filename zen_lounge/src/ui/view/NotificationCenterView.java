package ui.view;

import javax.swing.JButton;

import ui.common.VerticalLayout;
import ui.common.View;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class NotificationCenterView extends View{

	private JLabel titleLabel;
	
	private JPanel listPanel;
	
	private JPanel makeCell(String text){
		JPanel cell = new JPanel();
		
		//La cellule est composée de 4 éléments
		cell.setLayout(new GridLayout(0, 4, 0, 0));
				
		JLabel lblLabel = new JLabel("Label");
		lblLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cell.add(lblLabel);
		
		JTextField txtText = new JTextField();
		txtText.setHorizontalAlignment(SwingConstants.CENTER);
		txtText.setText(text);
		cell.add(txtText);
		txtText.setColumns(10);
		
		JCheckBox chckbxCheck = new JCheckBox("Check");
		cell.add(chckbxCheck);
		
		JButton btnPress = new JButton("Press");
		cell.add(btnPress);
		
		return cell;
	}
	
	public NotificationCenterView() {
		super("Notification Center");
		
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		titleLabel = new JLabel("Notifications");
		springLayout.putConstraint(SpringLayout.NORTH, titleLabel, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, titleLabel, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, titleLabel, 597, SpringLayout.WEST, this);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(titleLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 92, SpringLayout.SOUTH, titleLabel);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 107, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -106, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -108, SpringLayout.EAST, this);
		add(scrollPane);
		
		listPanel = new JPanel();
		scrollPane.setViewportView(listPanel);
		listPanel.setLayout(new VerticalLayout());

		//Enlever le commentaire suivant pour éditer avec WindowsBuilder l'apparence de la cellule
		//listPanel.add(makeCell("OK"));
				
		setNotifications(20);
	}
	
	public void setNotifications(int nbNotif) {
		titleLabel.setText("Vous avez "+nbNotif+" nouvelles notifications");
		for(int i = 0 ; i < nbNotif ; i++){
			listPanel.add(makeCell("Notification N° "+(i+1)));
		}
	}
}
