package UI.Common;


public interface ViewIF {
	
    public void reload();
    public void alert(String message);
    public int confirm(String message);
    public String prompt(String message);
    public void log(String message);
    public void error(String message);
    
}