import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;

public class loadingScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loadingScreen frame = new loadingScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loadingScreen() {
		setUndecorated(true);
		setType(Type.POPUP);
		setResizable(false);
		setBackground(UIManager.getColor("ComboBox.buttonShadow"));
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 90);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("scrollbar"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblZenloungeIsLoading = new JLabel("ZenLounge is loading...");
		lblZenloungeIsLoading.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblZenloungeIsLoading.setFont(new Font("Arial", Font.BOLD, 12));
		lblZenloungeIsLoading.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblZenloungeIsLoading, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}

}
