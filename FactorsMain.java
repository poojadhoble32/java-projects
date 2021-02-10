package Facrors;
import java.util.Scanner;

public class FactorsMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        System.err.println("enter number");
		int No=sc.nextInt();
		 
		Factors f=new Factors();
		//f.FindFactors(No);
		
		Factorial ff=new Factorial();
		int Ret=ff.factorial(No);
		
		System.out.println(Ret);
	}

}
