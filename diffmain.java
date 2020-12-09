package diff;

import java.util.Scanner;

public class diffmain {
	public static void main(String args[])
	{
         Scanner sc=new Scanner(System.in);
         diffclass ca=new diffclass();
         System.out.println("enter the size of array:");
         int size=sc.nextInt();
         
         int Array1[]=new int[size];
         
         System.out.println("enter array:");
         
         for(int i=0;i<Array1.length;i++)
         {
        	 Array1[i]=sc.nextInt();
         }
         
         int iRet=ca.diffun(Array1);
       
         System.out.println("diff is:"+iRet);
	}
}
