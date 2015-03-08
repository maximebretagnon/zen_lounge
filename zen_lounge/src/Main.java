import persistance.MySQLDatabase;
import ui.common.Frame;
import ui.view.LoginView;

public class Main {
	public static void main(String[] args) {
			loadingScreen ls = new loadingScreen();
			ls.setVisible(true);
		
			MySQLDatabase.getInstance().open();
			
			LoginView loginView = new LoginView();
			
			Frame f = Frame.getFrame();
			f.setView(loginView);

			ls.dispose();
			f.setVisible(true);
	}
}