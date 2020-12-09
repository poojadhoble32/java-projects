package reversearray;

import java.util.Scanner;

//import array1.CopyArray;

public class reversemain {
	public static void main(String args[])
	{
         Scanner sc=new Scanner(System.in);
         ReverseArray ca=new ReverseArray();
         System.out.println("enter size of array:");
         int size=sc.nextInt();
         
         int Array1[]=new int[size];
         //int Array2[]=new int[size];
         
         System.out.println("enter array:");
         
         for(int i=0;i<Array1.length;i++)
         {
        	 Array1[i]=sc.nextInt();
         }
         
         ca.reversea(Array1,size);
         for(int i=0;i<Array1.length;i++)
         {
        	 System.out.println(Array1[i]);
         }
         
	}


}
