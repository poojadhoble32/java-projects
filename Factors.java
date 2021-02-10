package Facrors;

public class Factors {
	int arr[]=new int[20];
	int i,j=0;
	
	void FindFactors(int No)
	{
		for(i=1;i<No;i++)
		{
			if(No%i==0)
			{
				arr[j]=i;
				j++;
			}
		}
		
		for(int k:arr)
		{
			if(k!=0)
			{
				System.err.print(k+" ");
			}
			else
			{
				break;
			}
			
			
		}
	 	
	}

}
