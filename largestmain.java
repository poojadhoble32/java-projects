package largestelementarray;

import java.util.Scanner;

//import reversearray.ReverseArray;

public class largestmain {
	public static void main(String args[])
	{
         Scanner sc=new Scanner(System.in);
         largestelement ca=new largestelement();
         System.out.println("enter the size of array:");
         int size=sc.nextInt();
         
         int Array1[]=new int[size];
         //int Array2[]=new int[size];
         
         System.out.println("enter array:");
         
         for(int i=0;i<Array1.length;i++)
         {
        	 Array1[i]=sc.nextInt();
         }
         
         int iRet=ca.secondlargestno(Array1);
       /*  ca.reversea(Array1,size);
         for(int i=0;i<Array1.length;i++)
         {
        	 System.out.println(Array1[i]);
         }
         */
         System.out.println("second:"+iRet);
	}


}
