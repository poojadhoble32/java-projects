package dayFind;

import java.util.Scanner;

public class DayMain {
	public static void main(String[] args)
			{
				int iDay=0;
				String sRet="\0"; 
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("enter day num : \n");
				
				iDay=sc.nextInt();
				
				Day D=new Day();
				
				sRet=D.findDay(iDay);
				
				System.out.println("today is \n"+sRet);
				
				
			}
	
}

