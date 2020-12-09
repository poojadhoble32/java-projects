package avgGrade;

import java.util.Scanner;

public class AvgMain {
	public static void main(String[] args)
	{
		int[] iMarksArray=new int[]{20,45,90,80,70,80};
		float fRet=0.0f;
			
		Scanner sc=new Scanner(System.in);
		
		AvgClass ac=new AvgClass();
	    
		fRet=ac.FindAvg(iMarksArray);
	
		System.out.println("Average is : \n"+fRet);
	}

}
