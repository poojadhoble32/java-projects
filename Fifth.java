import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

public class Fifth {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fifth window = new Fifth();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

public class watch implements Runnable{
JFrame f;
Thread t=null;
int hours=0, minutes=0, seconds=0;
String timeString = "";
JButton b;

watch(){
	f=new JFrame();
	
	t = new Thread(this);
        t.start();
	
	b=new JButton();
        b.setBounds(100,100,100,50);
	
	f.add(b);
	f.setSize(300,400);
	f.setLayout(null);
	f.setVisible(true);
}

 public void run() {
      try {
         while (true) {

            Calendar cal = Calendar.getInstance();
            hours = cal.get( Calendar.HOUR_OF_DAY );
            if ( hours > 12 ) hours -= 12;
            minutes = cal.get( Calendar.MINUTE );
            seconds = cal.get( Calendar.SECOND );

            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
            Date date = cal.getTime();
            timeString = formatter.format( date );

            printTime();

            t.sleep( 1000 );  // interval given in milliseconds
         }
      }
      catch (Exception e) { }
 }

public void printTime(){
b.setText(timeString);
}


	/**
	 * Create the application.
	 * @return 
	 */
	public void Fifth() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 144, 255));
		frame.getContentPane().setForeground(new Color(30, 144, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFileName = new JLabel("File Name:");
		lblFileName.setForeground(new Color(255, 255, 255));
		lblFileName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFileName.setBounds(101, 120, 90, 14);
		frame.getContentPane().add(lblFileName);
		
		textField = new JTextField();
		textField.setBounds(181, 118, 141, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnExtractHere = new JButton("Extract Here");
		btnExtractHere.setBounds(80, 179, 99, 23);
		frame.getContentPane().add(btnExtractHere);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(223, 179, 99, 23);
		frame.getContentPane().add(btnPrevious);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		desktopPane.setBounds(0, 0, 434, 70);
		frame.getContentPane().add(desktopPane);
		
		JLabel lblUnpackingPortal = new JLabel("UnPacking Portal");
		lblUnpackingPortal.setForeground(Color.BLUE);
		lblUnpackingPortal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUnpackingPortal.setBackground(new Color(0, 0, 255));
		lblUnpackingPortal.setBounds(10, 34, 126, 25);
		desktopPane.add(lblUnpackingPortal);
	}
}
}
