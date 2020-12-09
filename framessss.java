import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends Frame implements ActionListener{
	Label Result;
	 TextField username,password;
	    Button b1,b2;
	    Login()
	    {
	       
	        Result=new Label("------------");
	        Label n=new Label("Username:",Label.CENTER);
	        Label p=new Label("Password:",Label.CENTER);
	        username=new TextField(20);//for username
	        password=new TextField(20);//for password
	        password.setEchoChar('*');//for encryption
	        b1=new Button("submit");
	        b2=new Button("cancel");
	        this.add(n);
	        this.add(username);
	        this.add(p);
	        this.add(password);
	        this.add(b1);
	        this.add(b2);
	        this.add(Result);
	        b1.addActionListener( this);
	        b2.addActionListener( this);
	        n.setBounds(70,90,90,60);//for username
	        p.setBounds(70,130,90,60);//for password
	        Result.setBounds(10,250,180,20);//
	        username.setBounds(200,100,90,20);
	        password.setBounds(200,140,90,20);
	        b1.setBounds(100,260,70,40);
	        b2.setBounds(180,260,70,40);
	 
	    }
	    public static void main(String args[])
	    {
	        Login l=new Login();
	        
	        l.setSize(400,400);
	        l.setTitle("Marvellous Infosystem");
	        l.setVisible(true);
	 l.addWindowListener(new WindowAdapter()
	 {
		 public void windowClosing(WindowEvent we)
		 {
			 System.exit(0);
		 }
		 
	 });
	 
	    }
		@Override
		public void actionPerformed(ActionEvent e) {
			//		System.out.println("source =" +e.getSource());
			
			String name =username.getText();
			String pass=password.getText();
			
			if(e.getSource()==b1){
				System.out.println("source =>" +e.getSource());

				if(name.equals("mayuri") && pass.equals("mayuri@123"))
				{
				//System.out.println("valid");
					System.out.println("source =>" +e.getSource());
					Panel1 p1 = new Panel1();
					Result.setText("Login Successfully");
					Result.setForeground(Color.RED);
					
				}
				else {
					//System.out.println("invalid");
					Result.setText("Invalid credential");
					Result.setForeground(Color.RED);
					
				}
				
				
			}
			
				else if(e.getSource()==b2) {
				username.setText("");
				password.setText("");
				
				
			}
		}
	}
		
			
		


