package collectionpackage;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args)
	{
		int iRadius=0,iLength=0,iWidth=0,iRRet=0;
		float fcRet=0.0f;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter radius = \n");
		
		iRadius=sc.nextInt();
		
		AreaCircle Ac=new AreaCircle();
		
		fcRet=Ac.Area(iRadius);
				
		System.out.println("area is : "+fcRet);
		
		System.out.println("Enter length and width :\n");
		
		iLength=sc.nextInt();
		iWidth=sc.nextInt();
		
		iRRet=Ac.Rectangle(iLength,iWidth);
		
		System.out.println("Area of rectangle is : "+iRRet);
		
	}
}


