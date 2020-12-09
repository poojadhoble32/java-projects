package leapyear;

import java.util.Scanner;

public class LeapMain {
	public static void main(String[] args)
	{
		int iYear=0;
		
		Scanner sc=new Scanner(System.in);
         
		System.out.println("enter year : \n");
		
		LeapClass lc=new LeapClass();
		
		iYear=sc.nextInt();
		
		lc.FindLeapYear(iYear);
		
	}

}
