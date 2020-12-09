import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

public class third {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private final JDesktopPane desktopPane = new JDesktopPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					third window = new third();
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
	public third() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 144, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblDirectoryName = new JLabel("Directory Name:");
		lblDirectoryName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDirectoryName.setForeground(new Color(255, 255, 255));
		lblDirectoryName.setBounds(43, 100, 98, 14);
		frame.getContentPane().add(lblDirectoryName);
		
		JLabel lblDestinationFileName = new JLabel("Destination File Name:");
		lblDestinationFileName.setForeground(new Color(255, 255, 255));
		lblDestinationFileName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDestinationFileName.setBounds(43, 137, 138, 14);
		frame.getContentPane().add(lblDestinationFileName);
		
		textField = new JTextField();
		textField.setBounds(191, 98, 141, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 131, 141, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(73, 198, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnPrevious = new JButton("PREVIOUS");
		btnPrevious.setBounds(243, 198, 89, 23);
		frame.getContentPane().add(btnPrevious);
		desktopPane.setBackground(new Color(255, 255, 255));
		desktopPane.setBounds(0, 0, 434, 69);
		frame.getContentPane().add(desktopPane);
		
		JLabel lblPackingPortal = new JLabel("Packing Portal");
		lblPackingPortal.setForeground(Color.BLUE);
		lblPackingPortal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPackingPortal.setBounds(10, 39, 106, 19);
		desktopPane.add(lblPackingPortal);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
