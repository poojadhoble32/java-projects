import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JDesktopPane;

public class Dasarwad extends JFrame {

	private JPanel contentPane;
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
					Dasarwad frame = new Dasarwad();
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
	public Dasarwad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(85, 178, 91, 21);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(85, 220, 65, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(186, 179, 198, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 218, 198, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSubmit.setBounds(151, 275, 89, 23);
		contentPane.add(btnSubmit);
		desktopPane.setBackground(Color.WHITE);
		desktopPane.setBounds(0, 0, 484, 82);
		contentPane.add(desktopPane);
		
		JLabel lblMarvellousPackerUnpacker = new JLabel("Marvellous Packer Unpacker : Login");
		lblMarvellousPackerUnpacker.setForeground(Color.BLUE);
		lblMarvellousPackerUnpacker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarvellousPackerUnpacker.setBounds(10, 36, 238, 14);
		desktopPane.add(lblMarvellousPackerUnpacker);
	}
}
