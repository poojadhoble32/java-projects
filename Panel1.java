import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
public class Panel1  extends Frame{

	Panel1()
	{
		Button b1,b2;
		Frame f= new Frame("panel");//create frame
		Panel p=new Panel();//object create
		p.setBounds(0,300,2000,1000);//bonds set panel chya sides ni distance 
		p.setBackground(Color.red);//background color
		Button a=new Button("pack");//object of buttons
	    //  p.setLayout(new FlowLayout());        
		a.setBounds(200,200,80,30);//x,y,width,height
		a.setBackground(Color.white );
		
		Button b=new Button ("unpack");
		b.setBounds(200,200,80,30);
		b.setBackground(Color.white );
		p.add(a);//add buttons
		p.add(b);//add buttons
		f.add(p);//add panel
		f.setSize(400,400);//size of panel
		//f.setLayout(null);
		f.setVisible(true);
		
		 f.addWindowListener(new WindowAdapter()
		 {
			 public void windowClosing(WindowEvent we)
			 {
				 System.exit(0);
			 }
			 
		 });
		
		
		
	}

	public static void main(String[] args) throws IOException
	{
		new Panel1();
		
		
		
		
		
	
	}

}
