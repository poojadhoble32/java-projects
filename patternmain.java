package pattern;
import java.util.Scanner;

public class patternmain {
	public static void main(String[] args)
	{
		int iRow=0,iCol=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter row and col size :");
		
		iRow=sc.nextInt();
		iCol=sc.nextInt();
		
		Pattern p=new Pattern();
		
		p.Pattern(iRow,iCol);
	}

}
