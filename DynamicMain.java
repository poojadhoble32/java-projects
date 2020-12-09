package dynamicarray;
import java.util.Scanner;

public class DynamicMain {
        public static void main(String[] Args)
        {
        	int iValue=0,iRet=0;
        	
        	Scanner sc=new Scanner(System.in);
        	DynamicArray da=new DynamicArray();
        	
        	System.out.println("enter Size of array\n");
        	iValue=sc.nextInt();
        	
        	int[] Array=new int[iValue];
        	
        	System.out.println("enter values of array :"+iValue);
        	
        	for(int i=0;i<iValue;i++)
        	{
        		Array[i]=sc.nextInt();
        	}
        	
        	iRet=da.DArray(Array);
        	
        	System.out.println("sum is: "+iRet);
        }
}
