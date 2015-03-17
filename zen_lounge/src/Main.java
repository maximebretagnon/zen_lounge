import persistance.MySQLDatabase;
import persistance.factory.MySQLFactory;
import ui.common.Frame;
import ui.view.LoginView;

public class Main {
	public static void main(String[] args) {
			loadingScreen ls = new loadingScreen();
			ls.setVisible(true);
		
			MySQLDatabase.getInstance().open();

			LoginView loginView = new LoginView();
			
			Frame f = Frame.getFrame();
			f.setView(loginView,false);

			ls.dispose();
			f.setVisible(true);
	}
}