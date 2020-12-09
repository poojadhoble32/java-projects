package matrixlarge;

import java.util.Scanner;

public class matrixmain {
	public static void main(String args[])
	{
         Scanner sc=new Scanner(System.in);
         matrixclass ca=new matrixclass();
         
         int iRow=0,iCol=0;
         
         
         System.out.println("enter the row size:");
         iRow=sc.nextInt();
         System.out.println("enter the col size:");
         iCol=sc.nextInt();
         
         int Arr[][]=new int[iRow][iCol];
         
         System.out.println("enter matrix element");
         
         for(int i=0;i<iRow;i++)
         {
        	 for(int j=0;j<iCol;j++)
        	 {
        		 Arr[i][j]=sc.nextInt(); 
        	 }
         }
         
         int iRet=ca.matfun(Arr,iRow,iCol);
       
         System.out.println("large:"+iRet);
	}


}
