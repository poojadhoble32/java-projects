package checkchar;
import java.util.Scanner;

public class CharMain {
	public static void main(String[] args)
	{
	    char c='\0';
        boolean iRet=true;
        
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("enter char value");
	    
	    c=sc.next().charAt(0);
	    
	    checkChar cc=new checkChar();
	    
	    iRet=cc.CheckChar(c);
	    
	    if(iRet==true)
	    {
	    	System.out.println("char is special char");
	    }
	    else
	    {
	    	System.out.println("not special char");
	    }
	}

}
