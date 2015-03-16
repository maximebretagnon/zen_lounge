package ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ui.common.Frame;
import ui.common.View;
import bl.facade.EventFacade;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JSplitPane;

import java.awt.BorderLayout;

import javax.swing.JComboBox;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventInscriptionView extends View implements ActionListener
{
	//Buttons
	private JButton btnOk;
	private JButton btnSubmit;
	
	//Labels
	private JLabel lblChoice;
	private JLabel lblDate;
	private JLabel lblMorningSessions;
	private JLabel lblEveningSessions;
	
	//Combo boxes
	private JComboBox comboBoxChoice;
	private JComboBox comboBoxMorning;
	private JComboBox comboBoxEvening;
	private JComboBox comboBoxDate;

	public String inscriptionButton;

    public EventFacade eventFacade;
	
    public EventInscriptionView() 
    {
		super("Event Inscription");
		
		eventFacade = new EventFacade();
		setLayout(null);
		
		lblChoice = new JLabel("Please choose an event :");
		lblChoice.setBounds(23, 48, 121, 14);
		add(lblChoice);
		
		comboBoxChoice = new JComboBox();
		comboBoxChoice.setBounds(178, 48, 44, 20);
		eventFacade.eventManager.getAllEvents(comboBoxChoice);
		add(comboBoxChoice);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(258, 45, 47, 23);
		add(btnOk);
		
		lblMorningSessions = new JLabel("Morning sessions :");
		lblMorningSessions.setBounds(178, 109, 88, 14);
		add(lblMorningSessions);
		
		lblEveningSessions = new JLabel("Evening sessions :");
		lblEveningSessions.setBounds(324, 109, 88, 14);
		add(lblEveningSessions);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(194, 253, 65, 23);
		add(btnSubmit);
		
		comboBoxMorning = new JComboBox();
		comboBoxMorning.setBounds(178, 147, 28, 20);
		add(comboBoxMorning);
		
		comboBoxEvening = new JComboBox();
		comboBoxEvening.setBounds(324, 147, 28, 20);
		add(comboBoxEvening);
		
		lblDate = new JLabel("Date");
		lblDate.setBounds(65, 109, 23, 14);
		add(lblDate);
		
		comboBoxDate = new JComboBox();
		comboBoxDate.setBounds(65, 147, 28, 20);
		add(comboBoxDate);
		
		//add listeners
		btnOk.addActionListener(this);
		btnSubmit.addActionListener(this);
	
	}

    public void eventInscription() 
    {
    	String chosenEvent = "Yoga"; //comboBoxChoice.getSelectedItem().toString();
    	String userID = eventFacade.handleEventInscription(chosenEvent);
    	if(userID != null)
    	{
    		Frame.getFrame().setView(new EventDetailsView(chosenEvent),true);
        	Frame.getFrame().revalidate();
    	}
    	else 
    	{
    		JOptionPane.showMessageDialog(null, "vous n'etes pas un utilisateur, vérifiez votre ID");
    	} 	
    }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton source = (JButton)e.getSource();
		if(source.equals(btnOk))
		{
			eventInscription();
		}
		
	}
}
