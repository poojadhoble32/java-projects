package array1;
import java.util.Scanner;

public class copymain {
	public static void main(String args[])
	{
         Scanner sc=new Scanner(System.in);
         CopyArray ca=new CopyArray();
         System.out.println("enter size of array:");
         int size=sc.nextInt();
         
         int Array1[]=new int[size];
         int Array2[]=new int[size];
         
         System.out.println("enter array:");
         
         for(int i=0;i<Array1.length;i++)
         {
        	 Array1[i]=sc.nextInt();
         }
         
         ca.copya(Array1,Array2,size);
         for(int i=0;i<Array2.length;i++)
         {
        	 System.out.println(Array2[i]);
         }
         
	}

}
