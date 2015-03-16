package ui.common;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public abstract class View extends JPanel {
	
    private String name;
    
    public View(String name){
    	super();
    	this.name = name;
    }

    public View(String name2, boolean showMenu) {
		// TODO Auto-generated constructor stub
	}

	//Hook for reloading components of the page
    public void reload() {}
    
    //Default behaviour of an alert
    public void alert(String message) {
    	//System.out.println("Alert : "+message);
    	JOptionPane.showMessageDialog(Frame.getFrame(),message,"Alert",JOptionPane.WARNING_MESSAGE);
    }
    
    //Default behaviour of a confirm
    public boolean confirm(String message) {
    	int result = JOptionPane.showConfirmDialog(Frame.getFrame(),message,"Confirmation",JOptionPane.YES_NO_OPTION);
    	return result == 0;
    }
    
    //Default behaviour of a prompt
    public String prompt(String message) {
    	return JOptionPane.showInputDialog(Frame.getFrame(),message,"Prompt",JOptionPane.QUESTION_MESSAGE);
    }
    
    //Default behaviour of a log
    public void log(String message) {
    	System.out.println("Log : "+message);
    }
    
    //Default behaviour of a log
    public void error(String message) {
    	System.err.println("Error : "+message);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String value) {
        this.name = value;
    }
}