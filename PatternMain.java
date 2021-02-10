package pattern;
import java.util.Scanner;

public class PatternMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int Row=sc.nextInt();
		Pattern1 p1=new Pattern1();
		Pattern2 p2=new Pattern2();
		Pattern3 p3=new Pattern3();
		p3.pattern(Row);
	}

}
