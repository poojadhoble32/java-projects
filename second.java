import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;

public class second {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second window = new second();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public second() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 144, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPack = new JButton("Pack");
		btnPack.setBounds(62, 119, 89, 23);
		frame.getContentPane().add(btnPack);
		
		JButton btnUnpack = new JButton("Unpack");
		btnUnpack.setBounds(260, 119, 89, 23);
		frame.getContentPane().add(btnUnpack);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		desktopPane.setBounds(0, 0, 434, 75);
		frame.getContentPane().add(desktopPane);
		
		JLabel lblWelcomeSurajDasarwad = new JLabel("Welcome: Suraj Dasarwad");
		lblWelcomeSurajDasarwad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWelcomeSurajDasarwad.setForeground(new Color(0, 0, 255));
		lblWelcomeSurajDasarwad.setBounds(10, 37, 192, 14);
		desktopPane.add(lblWelcomeSurajDasarwad);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(272, 11, 152, 53);
		desktopPane.add(lblNewLabel);
	}
}
