package UI.Common;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTabbedPane;

public abstract class View extends JPanel {
	
    private String name;
    private JComponent panel;
    private JTabbedPane tabbedPane;
    
    public View(String name, boolean showMenu){
    	super();
    	this.name = name;
    	this.panel = new JPanel();
    	SpringLayout springLayout = new SpringLayout();
    	setLayout(springLayout);
    	
    	if (showMenu){
    		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        	springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 0, SpringLayout.NORTH, this);
        	springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, this);
        	springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, 445, SpringLayout.NORTH, this);
        	springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 714, SpringLayout.WEST, this);
        	add(tabbedPane);
        	tabbedPane.addTab("New tab", null, panel, null);
    	}

    	
    	

    }

    //Hook for reloading components of the page
    public void reload() {}
    //Default behaviour of an alert
    public void alert(String message) {
    	//System.out.println("Alert : "+message);
    	JOptionPane.showMessageDialog(Frame.getFrame(),message,"Alert",JOptionPane.WARNING_MESSAGE);
    }
    //Default behaviour of a confirm
    public int confirm(String message) {
    	return JOptionPane.showConfirmDialog(Frame.getFrame(),message,"Confirmation",JOptionPane.YES_NO_OPTION);
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